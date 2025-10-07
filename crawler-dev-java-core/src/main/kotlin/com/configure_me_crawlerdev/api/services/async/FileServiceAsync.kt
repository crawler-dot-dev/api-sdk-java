// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.async

import com.configure_me_crawlerdev.api.core.ClientOptions
import com.configure_me_crawlerdev.api.core.RequestOptions
import com.configure_me_crawlerdev.api.core.http.HttpResponseFor
import com.configure_me_crawlerdev.api.models.files.FileExtractTextParams
import com.configure_me_crawlerdev.api.models.files.FileExtractTextResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /**
     * Upload a file and extract text content from it. Supports PDF, DOC, DOCX, TXT and other
     * text-extractable document formats.
     */
    fun extractText(params: FileExtractTextParams): CompletableFuture<FileExtractTextResponse> =
        extractText(params, RequestOptions.none())

    /** @see extractText */
    fun extractText(
        params: FileExtractTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileExtractTextResponse>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/files/text`, but is otherwise the same as
         * [FileServiceAsync.extractText].
         */
        fun extractText(
            params: FileExtractTextParams
        ): CompletableFuture<HttpResponseFor<FileExtractTextResponse>> =
            extractText(params, RequestOptions.none())

        /** @see extractText */
        fun extractText(
            params: FileExtractTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileExtractTextResponse>>
    }
}
