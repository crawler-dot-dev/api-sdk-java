// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.blocking

import com.configure_me_crawlerdev.api.TestServerExtension
import com.configure_me_crawlerdev.api.client.okhttp.CrawlerDevOkHttpClient
import com.configure_me_crawlerdev.api.core.JsonValue
import com.configure_me_crawlerdev.api.models.urls.UrlExtractTextParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UrlServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun extractText() {
        val client =
            CrawlerDevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val urlService = client.urls()

        val response =
            urlService.extractText(
                UrlExtractTextParams.builder()
                    .url("url")
                    .cleanText(true)
                    .headers(
                        UrlExtractTextParams.Headers.builder()
                            .putAdditionalProperty("User-Agent", JsonValue.from("Custom Bot/1.0"))
                            .putAdditionalProperty("X-API-Key", JsonValue.from("my-api-key"))
                            .putAdditionalProperty("Accept-Language", JsonValue.from("en-US"))
                            .build()
                    )
                    .proxy(
                        UrlExtractTextParams.Proxy.builder()
                            .password("password")
                            .server("server")
                            .username("username")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
