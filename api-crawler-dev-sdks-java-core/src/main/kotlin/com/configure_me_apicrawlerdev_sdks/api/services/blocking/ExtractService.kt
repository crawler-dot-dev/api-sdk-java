// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.services.blocking

import com.configure_me_apicrawlerdev_sdks.api.core.ClientOptions
import com.configure_me_apicrawlerdev_sdks.api.core.RequestOptions
import com.configure_me_apicrawlerdev_sdks.api.core.http.HttpResponseFor
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileParams
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromFileResponse
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromUrlParams
import com.configure_me_apicrawlerdev_sdks.api.models.extract.ExtractFromUrlResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ExtractService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractService

    /**
     * Upload a file and extract text content from it. Supports PDF, DOC, DOCX, TXT and other
     * text-extractable document formats.
     */
    fun fromFile(params: ExtractFromFileParams): ExtractFromFileResponse =
        fromFile(params, RequestOptions.none())

    /** @see fromFile */
    fun fromFile(
        params: ExtractFromFileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractFromFileResponse

    /**
     * Extract text content from a webpage or document accessible via URL. Supports HTML, PDF, and
     * other web-accessible content types.
     */
    fun fromUrl(params: ExtractFromUrlParams): ExtractFromUrlResponse =
        fromUrl(params, RequestOptions.none())

    /** @see fromUrl */
    fun fromUrl(
        params: ExtractFromUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractFromUrlResponse

    /** A view of [ExtractService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/extract/file`, but is otherwise the same as
         * [ExtractService.fromFile].
         */
        @MustBeClosed
        fun fromFile(params: ExtractFromFileParams): HttpResponseFor<ExtractFromFileResponse> =
            fromFile(params, RequestOptions.none())

        /** @see fromFile */
        @MustBeClosed
        fun fromFile(
            params: ExtractFromFileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractFromFileResponse>

        /**
         * Returns a raw HTTP response for `post /v1/extract/url`, but is otherwise the same as
         * [ExtractService.fromUrl].
         */
        @MustBeClosed
        fun fromUrl(params: ExtractFromUrlParams): HttpResponseFor<ExtractFromUrlResponse> =
            fromUrl(params, RequestOptions.none())

        /** @see fromUrl */
        @MustBeClosed
        fun fromUrl(
            params: ExtractFromUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractFromUrlResponse>
    }
}
