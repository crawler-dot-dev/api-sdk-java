// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.models.urls

import com.configure_me_crawlerdev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlExtractTextParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
        assertThat(body.cacheAge()).contains(86400000L)
        assertThat(body.cleanText()).contains(true)
        assertThat(body.headers())
            .contains(
                UrlExtractTextParams.Headers.builder()
                    .putAdditionalProperty("User-Agent", JsonValue.from("Custom Bot/1.0"))
                    .putAdditionalProperty("X-API-Key", JsonValue.from("my-api-key"))
                    .putAdditionalProperty("Accept-Language", JsonValue.from("en-US"))
                    .build()
            )
        assertThat(body.maxRedirects()).contains(5L)
        assertThat(body.maxSize()).contains(10485760L)
        assertThat(body.maxTimeout()).contains(15000L)
        assertThat(body.proxy())
            .contains(
                UrlExtractTextParams.Proxy.builder()
                    .password("password")
                    .server("server")
                    .username("username")
                    .build()
            )
        assertThat(body.stealthMode()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UrlExtractTextParams.builder().url("url").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
    }
}
