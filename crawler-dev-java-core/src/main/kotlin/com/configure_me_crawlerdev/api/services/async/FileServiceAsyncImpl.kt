// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.async

import com.configure_me_crawlerdev.api.core.ClientOptions
import com.configure_me_crawlerdev.api.core.RequestOptions
import com.configure_me_crawlerdev.api.core.handlers.errorBodyHandler
import com.configure_me_crawlerdev.api.core.handlers.errorHandler
import com.configure_me_crawlerdev.api.core.handlers.jsonHandler
import com.configure_me_crawlerdev.api.core.http.HttpMethod
import com.configure_me_crawlerdev.api.core.http.HttpRequest
import com.configure_me_crawlerdev.api.core.http.HttpResponse
import com.configure_me_crawlerdev.api.core.http.HttpResponse.Handler
import com.configure_me_crawlerdev.api.core.http.HttpResponseFor
import com.configure_me_crawlerdev.api.core.http.multipartFormData
import com.configure_me_crawlerdev.api.core.http.parseable
import com.configure_me_crawlerdev.api.core.prepareAsync
import com.configure_me_crawlerdev.api.models.files.FileExtractTextParams
import com.configure_me_crawlerdev.api.models.files.FileExtractTextResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class FileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync =
        FileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extractText(
        params: FileExtractTextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileExtractTextResponse> =
        // post /v1/files/text
        withRawResponse().extractText(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileServiceAsync.WithRawResponse =
            FileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val extractTextHandler: Handler<FileExtractTextResponse> =
            jsonHandler<FileExtractTextResponse>(clientOptions.jsonMapper)

        override fun extractText(
            params: FileExtractTextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileExtractTextResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "files", "text")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { extractTextHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
