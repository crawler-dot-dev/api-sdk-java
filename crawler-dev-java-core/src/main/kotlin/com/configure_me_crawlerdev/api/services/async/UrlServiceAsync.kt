// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.async

import com.configure_me_crawlerdev.api.core.ClientOptions
import com.configure_me_crawlerdev.api.core.RequestOptions
import com.configure_me_crawlerdev.api.core.http.HttpResponseFor
import com.configure_me_crawlerdev.api.models.urls.UrlExtractTextParams
import com.configure_me_crawlerdev.api.models.urls.UrlExtractTextResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UrlServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlServiceAsync

    /**
     * Extract text content from a webpage or document accessible via URL. Supports HTML, PDF, and
     * other web-accessible content types.
     */
    fun extractText(params: UrlExtractTextParams): CompletableFuture<UrlExtractTextResponse> =
        extractText(params, RequestOptions.none())

    /** @see extractText */
    fun extractText(
        params: UrlExtractTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlExtractTextResponse>

    /** A view of [UrlServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/urls/text`, but is otherwise the same as
         * [UrlServiceAsync.extractText].
         */
        fun extractText(
            params: UrlExtractTextParams
        ): CompletableFuture<HttpResponseFor<UrlExtractTextResponse>> =
            extractText(params, RequestOptions.none())

        /** @see extractText */
        fun extractText(
            params: UrlExtractTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlExtractTextResponse>>
    }
}
