// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.services.blocking

import com.configure_me_apicrawlerdev_sdks.api.client.okhttp.ApiCrawlerDevSdksOkHttpClient
import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileParams
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromUrlParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExtractServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun fromFile() {
        val client = ApiCrawlerDevSdksOkHttpClient.builder().apiKey("My API Key").build()
        val extractService = client.extract()

        val response =
            extractService.fromFile(
                ExtractFromFileParams.builder()
                    .file("some content".byteInputStream())
                    .cleanText(true)
                    .addFormat(ExtractFromFileParams.Format.TEXT)
                    .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                    .maxTimeout("30s")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun fromUrl() {
        val client = ApiCrawlerDevSdksOkHttpClient.builder().apiKey("My API Key").build()
        val extractService = client.extract()

        val response =
            extractService.fromUrl(
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

        response.validate()
    }
}
