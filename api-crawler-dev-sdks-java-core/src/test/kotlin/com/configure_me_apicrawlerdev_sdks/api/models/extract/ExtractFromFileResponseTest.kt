// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.models.extract

import com.configure_me_apicrawlerdev_sdks.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractFromFileResponseTest {

    @Test
    fun create() {
        val extractFromFileResponse =
            ExtractFromFileResponse.builder()
                .contentType("text/html")
                .filename("document.html")
                .markdown("# Heading\n\nThis is the markdown representation...")
                .size(1024L)
                .text("This is the extracted text from your document...")
                .build()

        assertThat(extractFromFileResponse.contentType()).contains("text/html")
        assertThat(extractFromFileResponse.filename()).contains("document.html")
        assertThat(extractFromFileResponse.markdown())
            .contains("# Heading\n\nThis is the markdown representation...")
        assertThat(extractFromFileResponse.size()).contains(1024L)
        assertThat(extractFromFileResponse.text())
            .contains("This is the extracted text from your document...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractFromFileResponse =
            ExtractFromFileResponse.builder()
                .contentType("text/html")
                .filename("document.html")
                .markdown("# Heading\n\nThis is the markdown representation...")
                .size(1024L)
                .text("This is the extracted text from your document...")
                .build()

        val roundtrippedExtractFromFileResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractFromFileResponse),
                jacksonTypeRef<ExtractFromFileResponse>(),
            )

        assertThat(roundtrippedExtractFromFileResponse).isEqualTo(extractFromFileResponse)
    }
}
