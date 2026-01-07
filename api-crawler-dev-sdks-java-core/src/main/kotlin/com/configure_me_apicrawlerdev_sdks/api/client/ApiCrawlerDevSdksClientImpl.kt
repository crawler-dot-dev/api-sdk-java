// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.client

import com.configure_me_apicrawlerdev_sdks.api.core.ClientOptions
import com.configure_me_apicrawlerdev_sdks.api.core.getPackageVersion
import com.configure_me_apicrawlerdev_sdks.api.services.blocking.ExtractService
import com.configure_me_apicrawlerdev_sdks.api.services.blocking.ExtractServiceImpl
import java.util.function.Consumer

class ApiCrawlerDevSdksClientImpl(private val clientOptions: ClientOptions) :
    ApiCrawlerDevSdksClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: ApiCrawlerDevSdksClientAsync by lazy {
        ApiCrawlerDevSdksClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: ApiCrawlerDevSdksClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val extract: ExtractService by lazy { ExtractServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): ApiCrawlerDevSdksClientAsync = async

    override fun withRawResponse(): ApiCrawlerDevSdksClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiCrawlerDevSdksClient =
        ApiCrawlerDevSdksClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extract(): ExtractService = extract

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiCrawlerDevSdksClient.WithRawResponse {

        private val extract: ExtractService.WithRawResponse by lazy {
            ExtractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiCrawlerDevSdksClient.WithRawResponse =
            ApiCrawlerDevSdksClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun extract(): ExtractService.WithRawResponse = extract
    }
}
