// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.models.urls

import com.configure_me_crawlerdev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlExtractTextResponseTest {

    @Test
    fun create() {
        val urlExtractTextResponse =
            UrlExtractTextResponse.builder()
                .contentType("text/html")
                .extractedText("This is the extracted text from the webpage...")
                .finalUrl("https://example.com/article")
                .sizeBytes(2048L)
                .statusCode(200L)
                .success(true)
                .textLength(892L)
                .url("https://example.com/article")
                .build()

        assertThat(urlExtractTextResponse.contentType()).contains("text/html")
        assertThat(urlExtractTextResponse.extractedText())
            .contains("This is the extracted text from the webpage...")
        assertThat(urlExtractTextResponse.finalUrl()).contains("https://example.com/article")
        assertThat(urlExtractTextResponse.sizeBytes()).contains(2048L)
        assertThat(urlExtractTextResponse.statusCode()).contains(200L)
        assertThat(urlExtractTextResponse.success()).contains(true)
        assertThat(urlExtractTextResponse.textLength()).contains(892L)
        assertThat(urlExtractTextResponse.url()).contains("https://example.com/article")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlExtractTextResponse =
            UrlExtractTextResponse.builder()
                .contentType("text/html")
                .extractedText("This is the extracted text from the webpage...")
                .finalUrl("https://example.com/article")
                .sizeBytes(2048L)
                .statusCode(200L)
                .success(true)
                .textLength(892L)
                .url("https://example.com/article")
                .build()

        val roundtrippedUrlExtractTextResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlExtractTextResponse),
                jacksonTypeRef<UrlExtractTextResponse>(),
            )

        assertThat(roundtrippedUrlExtractTextResponse).isEqualTo(urlExtractTextResponse)
    }
}
