// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.services.async

import com.configure_me_apicrawlerdev_sdks.api.core.ClientOptions
import com.configure_me_apicrawlerdev_sdks.api.core.RequestOptions
import com.configure_me_apicrawlerdev_sdks.api.core.http.HttpResponseFor
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileParams
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileResponse
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromUrlParams
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromUrlResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExtractServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractServiceAsync

    /**
     * Upload a file and extract text content from it. Supports PDF, DOC, DOCX, TXT and other
     * text-extractable document formats.
     */
    fun fromFile(params: ExtractFromFileParams): CompletableFuture<ExtractFromFileResponse> =
        fromFile(params, RequestOptions.none())

    /** @see fromFile */
    fun fromFile(
        params: ExtractFromFileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractFromFileResponse>

    /**
     * Extract text content from a webpage or document accessible via URL. Supports HTML, PDF, and
     * other web-accessible content types.
     */
    fun fromUrl(params: ExtractFromUrlParams): CompletableFuture<ExtractFromUrlResponse> =
        fromUrl(params, RequestOptions.none())

    /** @see fromUrl */
    fun fromUrl(
        params: ExtractFromUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractFromUrlResponse>

    /**
     * A view of [ExtractServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtractServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/extract/file`, but is otherwise the same as
         * [ExtractServiceAsync.fromFile].
         */
        fun fromFile(
            params: ExtractFromFileParams
        ): CompletableFuture<HttpResponseFor<ExtractFromFileResponse>> =
            fromFile(params, RequestOptions.none())

        /** @see fromFile */
        fun fromFile(
            params: ExtractFromFileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractFromFileResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/extract/url`, but is otherwise the same as
         * [ExtractServiceAsync.fromUrl].
         */
        fun fromUrl(
            params: ExtractFromUrlParams
        ): CompletableFuture<HttpResponseFor<ExtractFromUrlResponse>> =
            fromUrl(params, RequestOptions.none())

        /** @see fromUrl */
        fun fromUrl(
            params: ExtractFromUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractFromUrlResponse>>
    }
}
