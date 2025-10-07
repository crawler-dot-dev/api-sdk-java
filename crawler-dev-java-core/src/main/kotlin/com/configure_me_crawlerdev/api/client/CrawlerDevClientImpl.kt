// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.client

import com.configure_me_crawlerdev.api.core.ClientOptions
import com.configure_me_crawlerdev.api.core.getPackageVersion
import com.configure_me_crawlerdev.api.services.blocking.FileService
import com.configure_me_crawlerdev.api.services.blocking.FileServiceImpl
import com.configure_me_crawlerdev.api.services.blocking.UrlService
import com.configure_me_crawlerdev.api.services.blocking.UrlServiceImpl
import java.util.function.Consumer

class CrawlerDevClientImpl(private val clientOptions: ClientOptions) : CrawlerDevClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: CrawlerDevClientAsync by lazy { CrawlerDevClientAsyncImpl(clientOptions) }

    private val withRawResponse: CrawlerDevClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptionsWithUserAgent) }

    private val urls: UrlService by lazy { UrlServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): CrawlerDevClientAsync = async

    override fun withRawResponse(): CrawlerDevClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrawlerDevClient =
        CrawlerDevClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileService = files

    override fun urls(): UrlService = urls

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CrawlerDevClient.WithRawResponse {

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val urls: UrlService.WithRawResponse by lazy {
            UrlServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrawlerDevClient.WithRawResponse =
            CrawlerDevClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun files(): FileService.WithRawResponse = files

        override fun urls(): UrlService.WithRawResponse = urls
    }
}
