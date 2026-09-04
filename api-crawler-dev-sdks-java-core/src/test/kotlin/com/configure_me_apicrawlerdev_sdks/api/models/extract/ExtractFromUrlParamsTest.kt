// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.models.extract

import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractFromUrlParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
        assertThat(body.cacheAge()).contains(ExtractFromUrlParams.CacheAge.ofString("1d"))
        assertThat(body.cleanText()).contains(true)
        assertThat(body.formats().getOrNull())
            .containsExactly(ExtractFromUrlParams.Format.TEXT, ExtractFromUrlParams.Format.MARKDOWN)
        assertThat(body.headers())
            .contains(
                ExtractFromUrlParams.Headers.builder()
                    .putAdditionalProperty("User-Agent", JsonValue.from("Custom Bot/1.0"))
                    .putAdditionalProperty("X-API-Key", JsonValue.from("my-api-key"))
                    .putAdditionalProperty("Accept-Language", JsonValue.from("en-US"))
                    .build()
            )
        assertThat(body.maxRedirects()).contains(5L)
        assertThat(body.maxSize()).contains(ExtractFromUrlParams.MaxSize.ofString("8mb"))
        assertThat(body.maxTimeout()).contains(ExtractFromUrlParams.MaxTimeout.ofString("15s"))
        assertThat(body.proxy())
            .contains(
                ExtractFromUrlParams.Proxy.builder()
                    .password("password")
                    .server("server")
                    .username("username")
                    .build()
            )
        assertThat(body.stealthMode()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExtractFromUrlParams.builder().url("url").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
    }
}
