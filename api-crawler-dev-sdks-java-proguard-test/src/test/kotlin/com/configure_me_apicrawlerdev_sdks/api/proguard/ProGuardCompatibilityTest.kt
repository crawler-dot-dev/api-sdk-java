// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.proguard

import com.configure_me_apicrawlerdev_sdks.api.client.okhttp.ApiCrawlerDevSdksOkHttpClient
import com.configure_me_apicrawlerdev_sdks.api.core.jsonMapper
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/api-crawler-dev-sdks-java-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = ApiCrawlerDevSdksOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.extract()).isNotNull()
    }

    @Test
    fun extractFromFileResponseRoundtrip() {
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
