// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.services.async

import com.configure_me_apicrawlerdev_sdks.api.client.okhttp.ApiCrawlerDevSdksOkHttpClientAsync
import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileParams
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromUrlParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExtractServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun fromFile() {
        val client = ApiCrawlerDevSdksOkHttpClientAsync.builder().apiKey("My API Key").build()
        val extractServiceAsync = client.extract()

        val responseFuture =
            extractServiceAsync.fromFile(
                ExtractFromFileParams.builder()
                    .file("Example data".byteInputStream())
                    .cleanText(true)
                    .addFormat(ExtractFromFileParams.Format.TEXT)
                    .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                    .maxTimeout("30s")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun fromUrl() {
        val client = ApiCrawlerDevSdksOkHttpClientAsync.builder().apiKey("My API Key").build()
        val extractServiceAsync = client.extract()

        val responseFuture =
            extractServiceAsync.fromUrl(
                ExtractFromUrlParams.builder()
                    .url("url")
                    .cacheAge("1d")
                    .cleanText(true)
                    .addFormat(ExtractFromUrlParams.Format.TEXT)
                    .addFormat(ExtractFromUrlParams.Format.MARKDOWN)
                    .headers(
                        ExtractFromUrlParams.Headers.builder()
                            .putAdditionalProperty("User-Agent", JsonValue.from("Custom Bot/1.0"))
                            .putAdditionalProperty("X-API-Key", JsonValue.from("my-api-key"))
                            .putAdditionalProperty("Accept-Language", JsonValue.from("en-US"))
                            .build()
                    )
                    .maxRedirects(5L)
                    .maxSize("8mb")
                    .maxTimeout("15s")
                    .proxy(
                        ExtractFromUrlParams.Proxy.builder()
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
