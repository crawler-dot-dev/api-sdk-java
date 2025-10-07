// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.async

import com.configure_me_crawlerdev.api.TestServerExtension
import com.configure_me_crawlerdev.api.client.okhttp.CrawlerDevOkHttpClientAsync
import com.configure_me_crawlerdev.api.models.urls.UrlExtractTextParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UrlServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun extractText() {
        val client =
            CrawlerDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val urlServiceAsync = client.urls()

        val responseFuture =
            urlServiceAsync.extractText(
                UrlExtractTextParams.builder()
                    .url("url")
                    .cleanText(true)
                    .renderJs(true)
                    .stripBoilerplate(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
