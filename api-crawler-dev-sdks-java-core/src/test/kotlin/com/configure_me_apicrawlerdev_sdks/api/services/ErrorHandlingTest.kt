// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.services

import com.configure_me_apicrawlerdev_sdks.api.client.ApiCrawlerDevSdksClient
import com.configure_me_apicrawlerdev_sdks.api.client.okhttp.ApiCrawlerDevSdksOkHttpClient
import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue
import com.configure_me_apicrawlerdev_sdks.api.core.http.Headers
import com.configure_me_apicrawlerdev_sdks.api.core.jsonMapper
import com.configure_me_apicrawlerdev_sdks.api.errors.ApiCrawlerDevSdksException
import com.configure_me_apicrawlerdev_sdks.api.errors.BadRequestException
import com.configure_me_apicrawlerdev_sdks.api.errors.InternalServerException
import com.configure_me_apicrawlerdev_sdks.api.errors.NotFoundException
import com.configure_me_apicrawlerdev_sdks.api.errors.PermissionDeniedException
import com.configure_me_apicrawlerdev_sdks.api.errors.RateLimitException
import com.configure_me_apicrawlerdev_sdks.api.errors.UnauthorizedException
import com.configure_me_apicrawlerdev_sdks.api.errors.UnexpectedStatusCodeException
import com.configure_me_apicrawlerdev_sdks.api.errors.UnprocessableEntityException
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: ApiCrawlerDevSdksClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ApiCrawlerDevSdksOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun extractFromFile400() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile400WithRawResponse() {
        val extractService = client.extract().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile401() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile401WithRawResponse() {
        val extractService = client.extract().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile403() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile403WithRawResponse() {
        val extractService = client.extract().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile404() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile404WithRawResponse() {
        val extractService = client.extract().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile422() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile422WithRawResponse() {
        val extractService = client.extract().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile429() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile429WithRawResponse() {
        val extractService = client.extract().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile500() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile500WithRawResponse() {
        val extractService = client.extract().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile999() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFile999WithRawResponse() {
        val extractService = client.extract().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun extractFromFileInvalidJsonBody() {
        val extractService = client.extract()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<ApiCrawlerDevSdksException> {
                extractService.fromFile(
                    ExtractFromFileParams.builder()
                        .file("Example data".byteInputStream())
                        .cleanText(true)
                        .addFormat(ExtractFromFileParams.Format.TEXT)
                        .addFormat(ExtractFromFileParams.Format.MARKDOWN)
                        .maxTimeout("30s")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
