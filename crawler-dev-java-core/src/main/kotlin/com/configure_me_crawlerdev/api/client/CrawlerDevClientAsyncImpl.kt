// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.client

import com.configure_me_crawlerdev.api.core.ClientOptions
import com.configure_me_crawlerdev.api.core.getPackageVersion
import com.configure_me_crawlerdev.api.services.async.FileServiceAsync
import com.configure_me_crawlerdev.api.services.async.FileServiceAsyncImpl
import com.configure_me_crawlerdev.api.services.async.UrlServiceAsync
import com.configure_me_crawlerdev.api.services.async.UrlServiceAsyncImpl
import java.util.function.Consumer

class CrawlerDevClientAsyncImpl(private val clientOptions: ClientOptions) : CrawlerDevClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: CrawlerDevClient by lazy { CrawlerDevClientImpl(clientOptions) }

    private val withRawResponse: CrawlerDevClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val urls: UrlServiceAsync by lazy { UrlServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): CrawlerDevClient = sync

    override fun withRawResponse(): CrawlerDevClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrawlerDevClientAsync =
        CrawlerDevClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileServiceAsync = files

    override fun urls(): UrlServiceAsync = urls

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CrawlerDevClientAsync.WithRawResponse {

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val urls: UrlServiceAsync.WithRawResponse by lazy {
            UrlServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrawlerDevClientAsync.WithRawResponse =
            CrawlerDevClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun files(): FileServiceAsync.WithRawResponse = files

        override fun urls(): UrlServiceAsync.WithRawResponse = urls
    }
}
