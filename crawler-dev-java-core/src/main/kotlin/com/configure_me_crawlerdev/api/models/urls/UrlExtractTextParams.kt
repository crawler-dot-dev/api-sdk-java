// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.models.urls

import com.configure_me_crawlerdev.api.core.ExcludeMissing
import com.configure_me_crawlerdev.api.core.JsonField
import com.configure_me_crawlerdev.api.core.JsonMissing
import com.configure_me_crawlerdev.api.core.JsonValue
import com.configure_me_crawlerdev.api.core.Params
import com.configure_me_crawlerdev.api.core.checkRequired
import com.configure_me_crawlerdev.api.core.http.Headers
import com.configure_me_crawlerdev.api.core.http.QueryParams
import com.configure_me_crawlerdev.api.errors.CrawlerDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Extract text content from a webpage or document accessible via URL. Supports HTML, PDF, and other
 * web-accessible content types.
 */
class UrlExtractTextParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The URL to extract text from.
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * Whether to clean extracted text
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cleanText(): Optional<Boolean> = body.cleanText()

    /**
     * Whether to render JavaScript for HTML content. This parameter is ignored for binary content
     * types (PDF, DOC, etc.) since they are not HTML.
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun renderJs(): Optional<Boolean> = body.renderJs()

    /**
     * Whether to remove boilerplate text
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stripBoilerplate(): Optional<Boolean> = body.stripBoilerplate()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [cleanText].
     *
     * Unlike [cleanText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cleanText(): JsonField<Boolean> = body._cleanText()

    /**
     * Returns the raw JSON value of [renderJs].
     *
     * Unlike [renderJs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _renderJs(): JsonField<Boolean> = body._renderJs()

    /**
     * Returns the raw JSON value of [stripBoilerplate].
     *
     * Unlike [stripBoilerplate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _stripBoilerplate(): JsonField<Boolean> = body._stripBoilerplate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UrlExtractTextParams].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UrlExtractTextParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(urlExtractTextParams: UrlExtractTextParams) = apply {
            body = urlExtractTextParams.body.toBuilder()
            additionalHeaders = urlExtractTextParams.additionalHeaders.toBuilder()
            additionalQueryParams = urlExtractTextParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [url]
         * - [cleanText]
         * - [renderJs]
         * - [stripBoilerplate]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The URL to extract text from. */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** Whether to clean extracted text */
        fun cleanText(cleanText: Boolean) = apply { body.cleanText(cleanText) }

        /**
         * Sets [Builder.cleanText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cleanText] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cleanText(cleanText: JsonField<Boolean>) = apply { body.cleanText(cleanText) }

        /**
         * Whether to render JavaScript for HTML content. This parameter is ignored for binary
         * content types (PDF, DOC, etc.) since they are not HTML.
         */
        fun renderJs(renderJs: Boolean) = apply { body.renderJs(renderJs) }

        /**
         * Sets [Builder.renderJs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.renderJs] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun renderJs(renderJs: JsonField<Boolean>) = apply { body.renderJs(renderJs) }

        /** Whether to remove boilerplate text */
        fun stripBoilerplate(stripBoilerplate: Boolean) = apply {
            body.stripBoilerplate(stripBoilerplate)
        }

        /**
         * Sets [Builder.stripBoilerplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stripBoilerplate] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stripBoilerplate(stripBoilerplate: JsonField<Boolean>) = apply {
            body.stripBoilerplate(stripBoilerplate)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UrlExtractTextParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UrlExtractTextParams =
            UrlExtractTextParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val cleanText: JsonField<Boolean>,
        private val renderJs: JsonField<Boolean>,
        private val stripBoilerplate: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("clean_text")
            @ExcludeMissing
            cleanText: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("render_js")
            @ExcludeMissing
            renderJs: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("strip_boilerplate")
            @ExcludeMissing
            stripBoilerplate: JsonField<Boolean> = JsonMissing.of(),
        ) : this(url, cleanText, renderJs, stripBoilerplate, mutableMapOf())

        /**
         * The URL to extract text from.
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Whether to clean extracted text
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cleanText(): Optional<Boolean> = cleanText.getOptional("clean_text")

        /**
         * Whether to render JavaScript for HTML content. This parameter is ignored for binary
         * content types (PDF, DOC, etc.) since they are not HTML.
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun renderJs(): Optional<Boolean> = renderJs.getOptional("render_js")

        /**
         * Whether to remove boilerplate text
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stripBoilerplate(): Optional<Boolean> =
            stripBoilerplate.getOptional("strip_boilerplate")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [cleanText].
         *
         * Unlike [cleanText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clean_text") @ExcludeMissing fun _cleanText(): JsonField<Boolean> = cleanText

        /**
         * Returns the raw JSON value of [renderJs].
         *
         * Unlike [renderJs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("render_js") @ExcludeMissing fun _renderJs(): JsonField<Boolean> = renderJs

        /**
         * Returns the raw JSON value of [stripBoilerplate].
         *
         * Unlike [stripBoilerplate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("strip_boilerplate")
        @ExcludeMissing
        fun _stripBoilerplate(): JsonField<Boolean> = stripBoilerplate

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var cleanText: JsonField<Boolean> = JsonMissing.of()
            private var renderJs: JsonField<Boolean> = JsonMissing.of()
            private var stripBoilerplate: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                url = body.url
                cleanText = body.cleanText
                renderJs = body.renderJs
                stripBoilerplate = body.stripBoilerplate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The URL to extract text from. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Whether to clean extracted text */
            fun cleanText(cleanText: Boolean) = cleanText(JsonField.of(cleanText))

            /**
             * Sets [Builder.cleanText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cleanText] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cleanText(cleanText: JsonField<Boolean>) = apply { this.cleanText = cleanText }

            /**
             * Whether to render JavaScript for HTML content. This parameter is ignored for binary
             * content types (PDF, DOC, etc.) since they are not HTML.
             */
            fun renderJs(renderJs: Boolean) = renderJs(JsonField.of(renderJs))

            /**
             * Sets [Builder.renderJs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.renderJs] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun renderJs(renderJs: JsonField<Boolean>) = apply { this.renderJs = renderJs }

            /** Whether to remove boilerplate text */
            fun stripBoilerplate(stripBoilerplate: Boolean) =
                stripBoilerplate(JsonField.of(stripBoilerplate))

            /**
             * Sets [Builder.stripBoilerplate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stripBoilerplate] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stripBoilerplate(stripBoilerplate: JsonField<Boolean>) = apply {
                this.stripBoilerplate = stripBoilerplate
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("url", url),
                    cleanText,
                    renderJs,
                    stripBoilerplate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            url()
            cleanText()
            renderJs()
            stripBoilerplate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CrawlerDevInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (url.asKnown().isPresent) 1 else 0) +
                (if (cleanText.asKnown().isPresent) 1 else 0) +
                (if (renderJs.asKnown().isPresent) 1 else 0) +
                (if (stripBoilerplate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                url == other.url &&
                cleanText == other.cleanText &&
                renderJs == other.renderJs &&
                stripBoilerplate == other.stripBoilerplate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(url, cleanText, renderJs, stripBoilerplate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{url=$url, cleanText=$cleanText, renderJs=$renderJs, stripBoilerplate=$stripBoilerplate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlExtractTextParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UrlExtractTextParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
