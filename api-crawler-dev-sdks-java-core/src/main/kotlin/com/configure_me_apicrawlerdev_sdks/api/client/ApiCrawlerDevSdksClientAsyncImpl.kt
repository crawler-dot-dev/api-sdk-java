// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.client

import com.configure_me_apicrawlerdev_sdks.api.core.ClientOptions
import com.configure_me_apicrawlerdev_sdks.api.core.getPackageVersion
import com.configure_me_apicrawlerdev_sdks.api.services.async.ExtractServiceAsync
import com.configure_me_apicrawlerdev_sdks.api.services.async.ExtractServiceAsyncImpl
import java.util.function.Consumer

class ApiCrawlerDevSdksClientAsyncImpl(private val clientOptions: ClientOptions) :
    ApiCrawlerDevSdksClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: ApiCrawlerDevSdksClient by lazy { ApiCrawlerDevSdksClientImpl(clientOptions) }

    private val withRawResponse: ApiCrawlerDevSdksClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val extract: ExtractServiceAsync by lazy {
        ExtractServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): ApiCrawlerDevSdksClient = sync

    override fun withRawResponse(): ApiCrawlerDevSdksClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ApiCrawlerDevSdksClientAsync =
        ApiCrawlerDevSdksClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extract(): ExtractServiceAsync = extract

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiCrawlerDevSdksClientAsync.WithRawResponse {

        private val extract: ExtractServiceAsync.WithRawResponse by lazy {
            ExtractServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiCrawlerDevSdksClientAsync.WithRawResponse =
            ApiCrawlerDevSdksClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun extract(): ExtractServiceAsync.WithRawResponse = extract
    }
}
