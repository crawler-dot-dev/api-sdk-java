// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.models.files

import com.configure_me_crawlerdev.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileExtractTextResponseTest {

    @Test
    fun create() {
        val fileExtractTextResponse =
            FileExtractTextResponse.builder()
                .contentType("application/pdf")
                .extractedText("This is the extracted text from your document...")
                .filename("document.pdf")
                .sizeBytes(1024L)
                .textLength(1247L)
                .build()

        assertThat(fileExtractTextResponse.contentType()).contains("application/pdf")
        assertThat(fileExtractTextResponse.extractedText())
            .contains("This is the extracted text from your document...")
        assertThat(fileExtractTextResponse.filename()).contains("document.pdf")
        assertThat(fileExtractTextResponse.sizeBytes()).contains(1024L)
        assertThat(fileExtractTextResponse.textLength()).contains(1247L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileExtractTextResponse =
            FileExtractTextResponse.builder()
                .contentType("application/pdf")
                .extractedText("This is the extracted text from your document...")
                .filename("document.pdf")
                .sizeBytes(1024L)
                .textLength(1247L)
                .build()

        val roundtrippedFileExtractTextResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileExtractTextResponse),
                jacksonTypeRef<FileExtractTextResponse>(),
            )

        assertThat(roundtrippedFileExtractTextResponse).isEqualTo(fileExtractTextResponse)
    }
}
