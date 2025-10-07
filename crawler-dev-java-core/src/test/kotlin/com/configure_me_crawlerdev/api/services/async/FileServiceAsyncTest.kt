// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.async

import com.configure_me_crawlerdev.api.TestServerExtension
import com.configure_me_crawlerdev.api.client.okhttp.CrawlerDevOkHttpClientAsync
import com.configure_me_crawlerdev.api.models.files.FileExtractTextParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun extractText() {
        val client =
            CrawlerDevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val responseFuture =
            fileServiceAsync.extractText(
                FileExtractTextParams.builder()
                    .file("some content".byteInputStream())
                    .cleanText(true)
                    .stripBoilerplate(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
