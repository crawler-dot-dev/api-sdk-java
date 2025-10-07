// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.services.blocking

import com.configure_me_crawlerdev.api.core.ClientOptions
import com.configure_me_crawlerdev.api.core.RequestOptions
import com.configure_me_crawlerdev.api.core.http.HttpResponseFor
import com.configure_me_crawlerdev.api.models.urls.UrlExtractTextParams
import com.configure_me_crawlerdev.api.models.urls.UrlExtractTextResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface UrlService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlService

    /**
     * Extract text content from a webpage or document accessible via URL. Supports HTML, PDF, and
     * other web-accessible content types.
     */
    fun extractText(params: UrlExtractTextParams): UrlExtractTextResponse =
        extractText(params, RequestOptions.none())

    /** @see extractText */
    fun extractText(
        params: UrlExtractTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlExtractTextResponse

    /** A view of [UrlService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/urls/text`, but is otherwise the same as
         * [UrlService.extractText].
         */
        @MustBeClosed
        fun extractText(params: UrlExtractTextParams): HttpResponseFor<UrlExtractTextResponse> =
            extractText(params, RequestOptions.none())

        /** @see extractText */
        @MustBeClosed
        fun extractText(
            params: UrlExtractTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlExtractTextResponse>
    }
}
