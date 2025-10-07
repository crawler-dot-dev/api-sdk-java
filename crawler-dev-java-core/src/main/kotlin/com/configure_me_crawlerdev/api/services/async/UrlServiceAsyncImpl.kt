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
import com.configure_me_crawlerdev.api.core.http.json
import com.configure_me_crawlerdev.api.core.http.parseable
import com.configure_me_crawlerdev.api.core.prepareAsync
import com.configure_me_crawlerdev.api.models.urls.UrlExtractTextParams
import com.configure_me_crawlerdev.api.models.urls.UrlExtractTextResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class UrlServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UrlServiceAsync {

    private val withRawResponse: UrlServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UrlServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlServiceAsync =
        UrlServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extractText(
        params: UrlExtractTextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlExtractTextResponse> =
        // post /v1/urls/text
        withRawResponse().extractText(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UrlServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UrlServiceAsync.WithRawResponse =
            UrlServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val extractTextHandler: Handler<UrlExtractTextResponse> =
            jsonHandler<UrlExtractTextResponse>(clientOptions.jsonMapper)

        override fun extractText(
            params: UrlExtractTextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlExtractTextResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "urls", "text")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
