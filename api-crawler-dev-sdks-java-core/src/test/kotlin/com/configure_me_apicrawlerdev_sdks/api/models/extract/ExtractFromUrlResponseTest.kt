// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.models.extract

import com.configure_me_apicrawlerdev_sdks.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractFromUrlResponseTest {

    @Test
    fun create() {
        val extractFromUrlResponse =
            ExtractFromUrlResponse.builder()
                .contentType("text/html")
                .finalUrl("https://example.com/article")
                .markdown("# Article Title\n\nThis is the markdown representation...")
                .size(2048L)
                .statusCode(200L)
                .text("This is the extracted text from the webpage...")
                .url("https://example.com/article")
                .build()

        assertThat(extractFromUrlResponse.contentType()).contains("text/html")
        assertThat(extractFromUrlResponse.finalUrl()).contains("https://example.com/article")
        assertThat(extractFromUrlResponse.markdown())
            .contains("# Article Title\n\nThis is the markdown representation...")
        assertThat(extractFromUrlResponse.size()).contains(2048L)
        assertThat(extractFromUrlResponse.statusCode()).contains(200L)
        assertThat(extractFromUrlResponse.text())
            .contains("This is the extracted text from the webpage...")
        assertThat(extractFromUrlResponse.url()).contains("https://example.com/article")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractFromUrlResponse =
            ExtractFromUrlResponse.builder()
                .contentType("text/html")
                .finalUrl("https://example.com/article")
                .markdown("# Article Title\n\nThis is the markdown representation...")
                .size(2048L)
                .statusCode(200L)
                .text("This is the extracted text from the webpage...")
                .url("https://example.com/article")
                .build()

        val roundtrippedExtractFromUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractFromUrlResponse),
                jacksonTypeRef<ExtractFromUrlResponse>(),
            )

        assertThat(roundtrippedExtractFromUrlResponse).isEqualTo(extractFromUrlResponse)
    }
}
