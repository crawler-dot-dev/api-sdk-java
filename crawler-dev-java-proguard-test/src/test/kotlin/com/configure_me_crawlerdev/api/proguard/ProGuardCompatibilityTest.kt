// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.proguard

import com.configure_me_crawlerdev.api.client.okhttp.CrawlerDevOkHttpClient
import com.configure_me_crawlerdev.api.core.jsonMapper
import com.configure_me_crawlerdev.api.models.files.FileExtractTextResponse
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
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/crawler-dev-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = CrawlerDevOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.urls()).isNotNull()
    }

    @Test
    fun fileExtractTextResponseRoundtrip() {
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
