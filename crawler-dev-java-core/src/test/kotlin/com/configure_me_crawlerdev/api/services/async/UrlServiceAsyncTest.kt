// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.async

import com.configure_me_crawlerdev.api.TestServerExtension
import com.configure_me_crawlerdev.api.client.okhttp.CrawlerDevOkHttpClientAsync
import com.configure_me_crawlerdev.api.core.JsonValue
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
                    .cacheAge(86400000L)
                    .cleanText(true)
                    .headers(
                        UrlExtractTextParams.Headers.builder()
                            .putAdditionalProperty("User-Agent", JsonValue.from("Custom Bot/1.0"))
                            .putAdditionalProperty("X-API-Key", JsonValue.from("my-api-key"))
                            .putAdditionalProperty("Accept-Language", JsonValue.from("en-US"))
                            .build()
                    )
                    .maxRedirects(5L)
                    .maxSize(10485760L)
                    .maxTimeout(15000L)
                    .proxy(
                        UrlExtractTextParams.Proxy.builder()
                            .password("password")
                            .server("server")
                            .username("username")
                            .build()
                    )
                    .stealthMode(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
