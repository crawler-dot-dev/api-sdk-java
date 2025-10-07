// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.models.urls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlExtractTextParamsTest {

    @Test
    fun create() {
        UrlExtractTextParams.builder()
            .url("url")
            .cleanText(true)
            .renderJs(true)
            .stripBoilerplate(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            UrlExtractTextParams.builder()
                .url("url")
                .cleanText(true)
                .renderJs(true)
                .stripBoilerplate(true)
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
        assertThat(body.cleanText()).contains(true)
        assertThat(body.renderJs()).contains(true)
        assertThat(body.stripBoilerplate()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UrlExtractTextParams.builder().url("url").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
    }
}
