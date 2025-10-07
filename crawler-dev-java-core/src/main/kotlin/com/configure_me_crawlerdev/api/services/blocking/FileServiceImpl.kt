// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.blocking

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
import com.configure_me_crawlerdev.api.core.prepare
import com.configure_me_crawlerdev.api.models.files.FileExtractTextParams
import com.configure_me_crawlerdev.api.models.files.FileExtractTextResponse
import java.util.function.Consumer

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService =
        FileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extractText(
        params: FileExtractTextParams,
        requestOptions: RequestOptions,
    ): FileExtractTextResponse =
        // post /v1/files/text
        withRawResponse().extractText(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileService.WithRawResponse =
            FileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val extractTextHandler: Handler<FileExtractTextResponse> =
            jsonHandler<FileExtractTextResponse>(clientOptions.jsonMapper)

        override fun extractText(
            params: FileExtractTextParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileExtractTextResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "files", "text")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
