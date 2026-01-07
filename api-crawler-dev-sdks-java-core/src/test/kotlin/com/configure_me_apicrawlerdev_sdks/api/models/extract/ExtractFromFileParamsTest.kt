// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.models.extract

import com.configure_me_apicrawlerdev_sdks.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractFromFileParamsTest {

    @Test
    fun create() {
        ExtractFromFileParams.builder()
            .file("some content".byteInputStream())
            .cleanText(true)
            .addFormat(ExtractFromFileParams.Format.TEXT)
            .addFormat(ExtractFromFileParams.Format.MARKDOWN)
            .maxTimeout("30s")
            .build()
    }

    @Test
    fun body() {
        val params =
            ExtractFromFileParams.builder()
                .file("some content".byteInputStream())
                .cleanText(true)
                .addFormat(ExtractFromFileParams.Format.TEXT)
                .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                .maxTimeout("30s")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("some content".byteInputStream()),
                        "cleanText" to MultipartField.of(true),
                        "formats" to
                            MultipartField.of(
                                listOf(
                                    ExtractFromFileParams.Format.TEXT,
                                    ExtractFromFileParams.Format.MARKDOWN,
                                )
                            ),
                        "maxTimeout" to
                            MultipartField.of(ExtractFromFileParams.MaxTimeout.ofString("30s")),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExtractFromFileParams.builder().file("some content".byteInputStream()).build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf("file" to MultipartField.of("some content".byteInputStream())).mapValues {
                    (_, field) ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }
}
