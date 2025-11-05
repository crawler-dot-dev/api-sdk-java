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
import com.configure_me_crawlerdev.api.core.toImmutable
import com.configure_me_crawlerdev.api.errors.CrawlerDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
     * Maximum cache time in milliseconds for the webpage. Must be between 0 (no caching) and
     * 259200000 (3 days). Defaults to 172800000 (2 days) if not specified.
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cacheAge(): Optional<Long> = body.cacheAge()

    /**
     * Whether to clean extracted text
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cleanText(): Optional<Boolean> = body.cleanText()

    /**
     * Custom HTTP headers to send with the request (case-insensitive)
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = body.headers()

    /**
     * Maximum number of redirects to follow when fetching the URL. Must be between 0 (no redirects)
     * and 20. Defaults to 5 if not specified.
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxRedirects(): Optional<Long> = body.maxRedirects()

    /**
     * Maximum content length in bytes for the URL response. Must be between 1024 (1KB) and 52428800
     * (50MB). Defaults to 10485760 (10MB) if not specified.
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxSize(): Optional<Long> = body.maxSize()

    /**
     * Maximum time in milliseconds before the crawler gives up on loading a URL. Must be between
     * 1000 (1 second) and 30000 (30 seconds). Defaults to 10000 (10 seconds) if not specified.
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTimeout(): Optional<Long> = body.maxTimeout()

    /**
     * Proxy configuration for the request
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proxy(): Optional<Proxy> = body.proxy()

    /**
     * When enabled, we use a proxy for the request. If set to true, and the 'proxy' option is set,
     * it will be ignored. Defaults to false if not specified. Note: Enabling stealth_mode consumes
     * an additional credit/quota point (2 credits total instead of 1) for this request.
     *
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stealthMode(): Optional<Boolean> = body.stealthMode()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [cacheAge].
     *
     * Unlike [cacheAge], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cacheAge(): JsonField<Long> = body._cacheAge()

    /**
     * Returns the raw JSON value of [cleanText].
     *
     * Unlike [cleanText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cleanText(): JsonField<Boolean> = body._cleanText()

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _headers_(): JsonField<Headers> = body._headers_()

    /**
     * Returns the raw JSON value of [maxRedirects].
     *
     * Unlike [maxRedirects], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxRedirects(): JsonField<Long> = body._maxRedirects()

    /**
     * Returns the raw JSON value of [maxSize].
     *
     * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxSize(): JsonField<Long> = body._maxSize()

    /**
     * Returns the raw JSON value of [maxTimeout].
     *
     * Unlike [maxTimeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTimeout(): JsonField<Long> = body._maxTimeout()

    /**
     * Returns the raw JSON value of [proxy].
     *
     * Unlike [proxy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _proxy(): JsonField<Proxy> = body._proxy()

    /**
     * Returns the raw JSON value of [stealthMode].
     *
     * Unlike [stealthMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stealthMode(): JsonField<Boolean> = body._stealthMode()

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
         * - [cacheAge]
         * - [cleanText]
         * - [headers]
         * - [maxRedirects]
         * - etc.
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

        /**
         * Maximum cache time in milliseconds for the webpage. Must be between 0 (no caching) and
         * 259200000 (3 days). Defaults to 172800000 (2 days) if not specified.
         */
        fun cacheAge(cacheAge: Long) = apply { body.cacheAge(cacheAge) }

        /**
         * Sets [Builder.cacheAge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cacheAge] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cacheAge(cacheAge: JsonField<Long>) = apply { body.cacheAge(cacheAge) }

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

        /** Custom HTTP headers to send with the request (case-insensitive) */
        fun headers(headers: Headers) = apply { body.headers(headers) }

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { body.headers(headers) }

        /**
         * Maximum number of redirects to follow when fetching the URL. Must be between 0 (no
         * redirects) and 20. Defaults to 5 if not specified.
         */
        fun maxRedirects(maxRedirects: Long) = apply { body.maxRedirects(maxRedirects) }

        /**
         * Sets [Builder.maxRedirects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRedirects] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxRedirects(maxRedirects: JsonField<Long>) = apply { body.maxRedirects(maxRedirects) }

        /**
         * Maximum content length in bytes for the URL response. Must be between 1024 (1KB) and
         * 52428800 (50MB). Defaults to 10485760 (10MB) if not specified.
         */
        fun maxSize(maxSize: Long) = apply { body.maxSize(maxSize) }

        /**
         * Sets [Builder.maxSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxSize(maxSize: JsonField<Long>) = apply { body.maxSize(maxSize) }

        /**
         * Maximum time in milliseconds before the crawler gives up on loading a URL. Must be
         * between 1000 (1 second) and 30000 (30 seconds). Defaults to 10000 (10 seconds) if not
         * specified.
         */
        fun maxTimeout(maxTimeout: Long) = apply { body.maxTimeout(maxTimeout) }

        /**
         * Sets [Builder.maxTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTimeout] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTimeout(maxTimeout: JsonField<Long>) = apply { body.maxTimeout(maxTimeout) }

        /** Proxy configuration for the request */
        fun proxy(proxy: Proxy) = apply { body.proxy(proxy) }

        /**
         * Sets [Builder.proxy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proxy] with a well-typed [Proxy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun proxy(proxy: JsonField<Proxy>) = apply { body.proxy(proxy) }

        /**
         * When enabled, we use a proxy for the request. If set to true, and the 'proxy' option is
         * set, it will be ignored. Defaults to false if not specified. Note: Enabling stealth_mode
         * consumes an additional credit/quota point (2 credits total instead of 1) for this
         * request.
         */
        fun stealthMode(stealthMode: Boolean) = apply { body.stealthMode(stealthMode) }

        /**
         * Sets [Builder.stealthMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stealthMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stealthMode(stealthMode: JsonField<Boolean>) = apply { body.stealthMode(stealthMode) }

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
        private val cacheAge: JsonField<Long>,
        private val cleanText: JsonField<Boolean>,
        private val headers: JsonField<Headers>,
        private val maxRedirects: JsonField<Long>,
        private val maxSize: JsonField<Long>,
        private val maxTimeout: JsonField<Long>,
        private val proxy: JsonField<Proxy>,
        private val stealthMode: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cache_age") @ExcludeMissing cacheAge: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("clean_text")
            @ExcludeMissing
            cleanText: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
            @JsonProperty("max_redirects")
            @ExcludeMissing
            maxRedirects: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("max_size") @ExcludeMissing maxSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("max_timeout")
            @ExcludeMissing
            maxTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("proxy") @ExcludeMissing proxy: JsonField<Proxy> = JsonMissing.of(),
            @JsonProperty("stealth_mode")
            @ExcludeMissing
            stealthMode: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            url,
            cacheAge,
            cleanText,
            headers,
            maxRedirects,
            maxSize,
            maxTimeout,
            proxy,
            stealthMode,
            mutableMapOf(),
        )

        /**
         * The URL to extract text from.
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Maximum cache time in milliseconds for the webpage. Must be between 0 (no caching) and
         * 259200000 (3 days). Defaults to 172800000 (2 days) if not specified.
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cacheAge(): Optional<Long> = cacheAge.getOptional("cache_age")

        /**
         * Whether to clean extracted text
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cleanText(): Optional<Boolean> = cleanText.getOptional("clean_text")

        /**
         * Custom HTTP headers to send with the request (case-insensitive)
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * Maximum number of redirects to follow when fetching the URL. Must be between 0 (no
         * redirects) and 20. Defaults to 5 if not specified.
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxRedirects(): Optional<Long> = maxRedirects.getOptional("max_redirects")

        /**
         * Maximum content length in bytes for the URL response. Must be between 1024 (1KB) and
         * 52428800 (50MB). Defaults to 10485760 (10MB) if not specified.
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxSize(): Optional<Long> = maxSize.getOptional("max_size")

        /**
         * Maximum time in milliseconds before the crawler gives up on loading a URL. Must be
         * between 1000 (1 second) and 30000 (30 seconds). Defaults to 10000 (10 seconds) if not
         * specified.
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxTimeout(): Optional<Long> = maxTimeout.getOptional("max_timeout")

        /**
         * Proxy configuration for the request
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proxy(): Optional<Proxy> = proxy.getOptional("proxy")

        /**
         * When enabled, we use a proxy for the request. If set to true, and the 'proxy' option is
         * set, it will be ignored. Defaults to false if not specified. Note: Enabling stealth_mode
         * consumes an additional credit/quota point (2 credits total instead of 1) for this
         * request.
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stealthMode(): Optional<Boolean> = stealthMode.getOptional("stealth_mode")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [cacheAge].
         *
         * Unlike [cacheAge], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cache_age") @ExcludeMissing fun _cacheAge(): JsonField<Long> = cacheAge

        /**
         * Returns the raw JSON value of [cleanText].
         *
         * Unlike [cleanText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clean_text") @ExcludeMissing fun _cleanText(): JsonField<Boolean> = cleanText

        /**
         * Returns the raw JSON value of [headers].
         *
         * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers_(): JsonField<Headers> = headers

        /**
         * Returns the raw JSON value of [maxRedirects].
         *
         * Unlike [maxRedirects], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_redirects")
        @ExcludeMissing
        fun _maxRedirects(): JsonField<Long> = maxRedirects

        /**
         * Returns the raw JSON value of [maxSize].
         *
         * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Long> = maxSize

        /**
         * Returns the raw JSON value of [maxTimeout].
         *
         * Unlike [maxTimeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_timeout") @ExcludeMissing fun _maxTimeout(): JsonField<Long> = maxTimeout

        /**
         * Returns the raw JSON value of [proxy].
         *
         * Unlike [proxy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proxy") @ExcludeMissing fun _proxy(): JsonField<Proxy> = proxy

        /**
         * Returns the raw JSON value of [stealthMode].
         *
         * Unlike [stealthMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stealth_mode")
        @ExcludeMissing
        fun _stealthMode(): JsonField<Boolean> = stealthMode

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
            private var cacheAge: JsonField<Long> = JsonMissing.of()
            private var cleanText: JsonField<Boolean> = JsonMissing.of()
            private var headers: JsonField<Headers> = JsonMissing.of()
            private var maxRedirects: JsonField<Long> = JsonMissing.of()
            private var maxSize: JsonField<Long> = JsonMissing.of()
            private var maxTimeout: JsonField<Long> = JsonMissing.of()
            private var proxy: JsonField<Proxy> = JsonMissing.of()
            private var stealthMode: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                url = body.url
                cacheAge = body.cacheAge
                cleanText = body.cleanText
                headers = body.headers
                maxRedirects = body.maxRedirects
                maxSize = body.maxSize
                maxTimeout = body.maxTimeout
                proxy = body.proxy
                stealthMode = body.stealthMode
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

            /**
             * Maximum cache time in milliseconds for the webpage. Must be between 0 (no caching)
             * and 259200000 (3 days). Defaults to 172800000 (2 days) if not specified.
             */
            fun cacheAge(cacheAge: Long) = cacheAge(JsonField.of(cacheAge))

            /**
             * Sets [Builder.cacheAge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheAge] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cacheAge(cacheAge: JsonField<Long>) = apply { this.cacheAge = cacheAge }

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

            /** Custom HTTP headers to send with the request (case-insensitive) */
            fun headers(headers: Headers) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

            /**
             * Maximum number of redirects to follow when fetching the URL. Must be between 0 (no
             * redirects) and 20. Defaults to 5 if not specified.
             */
            fun maxRedirects(maxRedirects: Long) = maxRedirects(JsonField.of(maxRedirects))

            /**
             * Sets [Builder.maxRedirects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRedirects] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRedirects(maxRedirects: JsonField<Long>) = apply {
                this.maxRedirects = maxRedirects
            }

            /**
             * Maximum content length in bytes for the URL response. Must be between 1024 (1KB) and
             * 52428800 (50MB). Defaults to 10485760 (10MB) if not specified.
             */
            fun maxSize(maxSize: Long) = maxSize(JsonField.of(maxSize))

            /**
             * Sets [Builder.maxSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSize(maxSize: JsonField<Long>) = apply { this.maxSize = maxSize }

            /**
             * Maximum time in milliseconds before the crawler gives up on loading a URL. Must be
             * between 1000 (1 second) and 30000 (30 seconds). Defaults to 10000 (10 seconds) if not
             * specified.
             */
            fun maxTimeout(maxTimeout: Long) = maxTimeout(JsonField.of(maxTimeout))

            /**
             * Sets [Builder.maxTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTimeout] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTimeout(maxTimeout: JsonField<Long>) = apply { this.maxTimeout = maxTimeout }

            /** Proxy configuration for the request */
            fun proxy(proxy: Proxy) = proxy(JsonField.of(proxy))

            /**
             * Sets [Builder.proxy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proxy] with a well-typed [Proxy] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun proxy(proxy: JsonField<Proxy>) = apply { this.proxy = proxy }

            /**
             * When enabled, we use a proxy for the request. If set to true, and the 'proxy' option
             * is set, it will be ignored. Defaults to false if not specified. Note: Enabling
             * stealth_mode consumes an additional credit/quota point (2 credits total instead of 1)
             * for this request.
             */
            fun stealthMode(stealthMode: Boolean) = stealthMode(JsonField.of(stealthMode))

            /**
             * Sets [Builder.stealthMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stealthMode] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stealthMode(stealthMode: JsonField<Boolean>) = apply {
                this.stealthMode = stealthMode
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
                    cacheAge,
                    cleanText,
                    headers,
                    maxRedirects,
                    maxSize,
                    maxTimeout,
                    proxy,
                    stealthMode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            url()
            cacheAge()
            cleanText()
            headers().ifPresent { it.validate() }
            maxRedirects()
            maxSize()
            maxTimeout()
            proxy().ifPresent { it.validate() }
            stealthMode()
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
                (if (cacheAge.asKnown().isPresent) 1 else 0) +
                (if (cleanText.asKnown().isPresent) 1 else 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxRedirects.asKnown().isPresent) 1 else 0) +
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                (if (maxTimeout.asKnown().isPresent) 1 else 0) +
                (proxy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (stealthMode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                url == other.url &&
                cacheAge == other.cacheAge &&
                cleanText == other.cleanText &&
                headers == other.headers &&
                maxRedirects == other.maxRedirects &&
                maxSize == other.maxSize &&
                maxTimeout == other.maxTimeout &&
                proxy == other.proxy &&
                stealthMode == other.stealthMode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                url,
                cacheAge,
                cleanText,
                headers,
                maxRedirects,
                maxSize,
                maxTimeout,
                proxy,
                stealthMode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{url=$url, cacheAge=$cacheAge, cleanText=$cleanText, headers=$headers, maxRedirects=$maxRedirects, maxSize=$maxSize, maxTimeout=$maxTimeout, proxy=$proxy, stealthMode=$stealthMode, additionalProperties=$additionalProperties}"
    }

    /** Custom HTTP headers to send with the request (case-insensitive) */
    class Headers
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Headers = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    /** Proxy configuration for the request */
    class Proxy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val password: JsonField<String>,
        private val server: JsonField<String>,
        private val username: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
            @JsonProperty("server") @ExcludeMissing server: JsonField<String> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        ) : this(password, server, username, mutableMapOf())

        /**
         * Proxy password for authentication
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun password(): Optional<String> = password.getOptional("password")

        /**
         * Proxy server URL (e.g., http://proxy.example.com:8080 or socks5://proxy.example.com:1080)
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun server(): Optional<String> = server.getOptional("server")

        /**
         * Proxy username for authentication
         *
         * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun username(): Optional<String> = username.getOptional("username")

        /**
         * Returns the raw JSON value of [password].
         *
         * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

        /**
         * Returns the raw JSON value of [server].
         *
         * Unlike [server], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("server") @ExcludeMissing fun _server(): JsonField<String> = server

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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

            /** Returns a mutable builder for constructing an instance of [Proxy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Proxy]. */
        class Builder internal constructor() {

            private var password: JsonField<String> = JsonMissing.of()
            private var server: JsonField<String> = JsonMissing.of()
            private var username: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(proxy: Proxy) = apply {
                password = proxy.password
                server = proxy.server
                username = proxy.username
                additionalProperties = proxy.additionalProperties.toMutableMap()
            }

            /** Proxy password for authentication */
            fun password(password: String) = password(JsonField.of(password))

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

            /**
             * Proxy server URL (e.g., http://proxy.example.com:8080 or
             * socks5://proxy.example.com:1080)
             */
            fun server(server: String) = server(JsonField.of(server))

            /**
             * Sets [Builder.server] to an arbitrary JSON value.
             *
             * You should usually call [Builder.server] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun server(server: JsonField<String>) = apply { this.server = server }

            /** Proxy username for authentication */
            fun username(username: String) = username(JsonField.of(username))

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun username(username: JsonField<String>) = apply { this.username = username }

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
             * Returns an immutable instance of [Proxy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Proxy =
                Proxy(password, server, username, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Proxy = apply {
            if (validated) {
                return@apply
            }

            password()
            server()
            username()
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
            (if (password.asKnown().isPresent) 1 else 0) +
                (if (server.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Proxy &&
                password == other.password &&
                server == other.server &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(password, server, username, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Proxy{password=$password, server=$server, username=$username, additionalProperties=$additionalProperties}"
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
