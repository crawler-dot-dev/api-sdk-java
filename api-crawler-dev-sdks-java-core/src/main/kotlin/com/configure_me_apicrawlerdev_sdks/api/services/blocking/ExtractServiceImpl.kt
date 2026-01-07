// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.services.blocking

import com.configure_me_apicrawlerdev_sdks.api.core.ClientOptions
import com.configure_me_apicrawlerdev_sdks.api.core.RequestOptions
import com.configure_me_apicrawlerdev_sdks.api.core.handlers.errorBodyHandler
import com.configure_me_apicrawlerdev_sdks.api.core.handlers.errorHandler
import com.configure_me_apicrawlerdev_sdks.api.core.handlers.jsonHandler
import com.configure_me_apicrawlerdev_sdks.api.core.http.HttpMethod
import com.configure_me_apicrawlerdev_sdks.api.core.http.HttpRequest
import com.configure_me_apicrawlerdev_sdks.api.core.http.HttpResponse
import com.configure_me_apicrawlerdev_sdks.api.core.http.HttpResponse.Handler
import com.configure_me_apicrawlerdev_sdks.api.core.http.HttpResponseFor
import com.configure_me_apicrawlerdev_sdks.api.core.http.json
import com.configure_me_apicrawlerdev_sdks.api.core.http.multipartFormData
import com.configure_me_apicrawlerdev_sdks.api.core.http.parseable
import com.configure_me_apicrawlerdev_sdks.api.core.prepare
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileParams
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileResponse
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromUrlParams
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromUrlResponse
import java.util.function.Consumer

class ExtractServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExtractService {

    private val withRawResponse: ExtractService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExtractService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractService =
        ExtractServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fromFile(
        params: ExtractFromFileParams,
        requestOptions: RequestOptions,
    ): ExtractFromFileResponse =
        // post /v1/extract/file
        withRawResponse().fromFile(params, requestOptions).parse()

    override fun fromUrl(
        params: ExtractFromUrlParams,
        requestOptions: RequestOptions,
    ): ExtractFromUrlResponse =
        // post /v1/extract/url
        withRawResponse().fromUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtractService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtractService.WithRawResponse =
            ExtractServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val fromFileHandler: Handler<ExtractFromFileResponse> =
            jsonHandler<ExtractFromFileResponse>(clientOptions.jsonMapper)

        override fun fromFile(
            params: ExtractFromFileParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractFromFileResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "extract", "file")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fromFileHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fromUrlHandler: Handler<ExtractFromUrlResponse> =
            jsonHandler<ExtractFromUrlResponse>(clientOptions.jsonMapper)

        override fun fromUrl(
            params: ExtractFromUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractFromUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "extract", "url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fromUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
