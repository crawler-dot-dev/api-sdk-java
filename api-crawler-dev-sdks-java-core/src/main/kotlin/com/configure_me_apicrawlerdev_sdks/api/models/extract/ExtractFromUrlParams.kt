// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.models.extract

import com.configure_me_apicrawlerdev_sdks.api.core.BaseDeserializer
import com.configure_me_apicrawlerdev_sdks.api.core.BaseSerializer
import com.configure_me_apicrawlerdev_sdks.api.core.Enum
import com.configure_me_apicrawlerdev_sdks.api.core.ExcludeMissing
import com.configure_me_apicrawlerdev_sdks.api.core.JsonField
import com.configure_me_apicrawlerdev_sdks.api.core.JsonMissing
import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue
import com.configure_me_apicrawlerdev_sdks.api.core.Params
import com.configure_me_apicrawlerdev_sdks.api.core.allMaxBy
import com.configure_me_apicrawlerdev_sdks.api.core.checkKnown
import com.configure_me_apicrawlerdev_sdks.api.core.checkRequired
import com.configure_me_apicrawlerdev_sdks.api.core.getOrThrow
import com.configure_me_apicrawlerdev_sdks.api.core.http.Headers
import com.configure_me_apicrawlerdev_sdks.api.core.http.QueryParams
import com.configure_me_apicrawlerdev_sdks.api.core.toImmutable
import com.configure_me_apicrawlerdev_sdks.api.errors.ApiCrawlerDevSdksInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Extract text content from a webpage or document accessible via URL. Supports HTML, PDF, and other
 * web-accessible content types.
 */
class ExtractFromUrlParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The URL to extract text from.
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * Maximum acceptable age of cached content. This parameter controls how fresh cached data must
     * be to be used.
     * - If a cached item exists and is younger than this value, it will be used (cache hit)
     * - If a cached item exists but is older than this value, it will be ignored and fresh data
     *   will be fetched (cache miss)
     * - If set to 0, caching is disabled for this request (always fetches fresh data)
     * - When fresh data is fetched, it will be cached with this value as the TTL for future
     *   requests Accepts either:
     * - Integer: milliseconds (e.g., 86400000 for 1 day)
     * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h", "2d") Supported units: s
     *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 0 (no
     *   caching) and 3 days. Defaults to "2d" (2 days) if not specified. Examples:
     * - "1s": Only use cached items less than 1 second old; fetch fresh data if cache is older
     * - "1h": Only use cached items less than 1 hour old; fetch fresh data if cache is older
     * - 0: Disable caching entirely; always fetch fresh data
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cacheAge(): Optional<CacheAge> = body.cacheAge()

    /**
     * Whether to clean extracted text
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cleanText(): Optional<Boolean> = body.cleanText()

    /**
     * Array of output formats to include in the response. Options: 'text', 'markdown'.
     * - 'text': Extracted plain text (always available)
     * - 'markdown': Markdown representation (only available for HTML content, empty string
     *   otherwise) Defaults to ['text'] if not specified.
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun formats(): Optional<List<Format>> = body.formats()

    /**
     * Custom HTTP headers to send with the request (case-insensitive)
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = body.headers()

    /**
     * Maximum number of redirects to follow when fetching the URL. Must be between 0 (no redirects)
     * and 20. Defaults to 5 if not specified.
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxRedirects(): Optional<Long> = body.maxRedirects()

    /**
     * Maximum content length for the URL response. Accepts either:
     * - Integer: bytes (e.g., 8388608 for 8MB)
     * - String: size format with unit (e.g., "1kb", "55mb", "1.2gb") Supported units: b (bytes), kb
     *   (kilobytes), mb (megabytes), gb (gigabytes), tb (terabytes) Must be between 1KB and 8MB.
     *   Defaults to "8mb" (8MB) if not specified.
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxSize(): Optional<MaxSize> = body.maxSize()

    /**
     * Maximum time before the crawler gives up on loading a URL. Accepts either:
     * - Integer: milliseconds (e.g., 15000 for 15 seconds)
     * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
     *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 1 second and
     *   30 seconds. Defaults to "10s" (10 seconds) if not specified.
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxTimeout(): Optional<MaxTimeout> = body.maxTimeout()

    /**
     * Proxy configuration for the request
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun proxy(): Optional<Proxy> = body.proxy()

    /**
     * When enabled, we use a proxy for the request. If set to true, and the 'proxy' option is set,
     * it will be ignored. Defaults to false if not specified. Note: Enabling stealthMode consumes
     * an additional credit/quota point (2 credits total instead of 1) for this request.
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
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
    fun _cacheAge(): JsonField<CacheAge> = body._cacheAge()

    /**
     * Returns the raw JSON value of [cleanText].
     *
     * Unlike [cleanText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cleanText(): JsonField<Boolean> = body._cleanText()

    /**
     * Returns the raw JSON value of [formats].
     *
     * Unlike [formats], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _formats(): JsonField<List<Format>> = body._formats()

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
    fun _maxSize(): JsonField<MaxSize> = body._maxSize()

    /**
     * Returns the raw JSON value of [maxTimeout].
     *
     * Unlike [maxTimeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTimeout(): JsonField<MaxTimeout> = body._maxTimeout()

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
         * Returns a mutable builder for constructing an instance of [ExtractFromUrlParams].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractFromUrlParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(extractFromUrlParams: ExtractFromUrlParams) = apply {
            body = extractFromUrlParams.body.toBuilder()
            additionalHeaders = extractFromUrlParams.additionalHeaders.toBuilder()
            additionalQueryParams = extractFromUrlParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [url]
         * - [cacheAge]
         * - [cleanText]
         * - [formats]
         * - [headers]
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
         * Maximum acceptable age of cached content. This parameter controls how fresh cached data
         * must be to be used.
         * - If a cached item exists and is younger than this value, it will be used (cache hit)
         * - If a cached item exists but is older than this value, it will be ignored and fresh data
         *   will be fetched (cache miss)
         * - If set to 0, caching is disabled for this request (always fetches fresh data)
         * - When fresh data is fetched, it will be cached with this value as the TTL for future
         *   requests Accepts either:
         * - Integer: milliseconds (e.g., 86400000 for 1 day)
         * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h", "2d") Supported units: s
         *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 0 (no
         *   caching) and 3 days. Defaults to "2d" (2 days) if not specified. Examples:
         * - "1s": Only use cached items less than 1 second old; fetch fresh data if cache is older
         * - "1h": Only use cached items less than 1 hour old; fetch fresh data if cache is older
         * - 0: Disable caching entirely; always fetch fresh data
         */
        fun cacheAge(cacheAge: CacheAge) = apply { body.cacheAge(cacheAge) }

        /**
         * Sets [Builder.cacheAge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cacheAge] with a well-typed [CacheAge] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cacheAge(cacheAge: JsonField<CacheAge>) = apply { body.cacheAge(cacheAge) }

        /** Alias for calling [cacheAge] with `CacheAge.ofInteger(integer)`. */
        fun cacheAge(integer: Long) = apply { body.cacheAge(integer) }

        /** Alias for calling [cacheAge] with `CacheAge.ofString(string)`. */
        fun cacheAge(string: String) = apply { body.cacheAge(string) }

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
         * Array of output formats to include in the response. Options: 'text', 'markdown'.
         * - 'text': Extracted plain text (always available)
         * - 'markdown': Markdown representation (only available for HTML content, empty string
         *   otherwise) Defaults to ['text'] if not specified.
         */
        fun formats(formats: List<Format>) = apply { body.formats(formats) }

        /**
         * Sets [Builder.formats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formats] with a well-typed `List<Format>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formats(formats: JsonField<List<Format>>) = apply { body.formats(formats) }

        /**
         * Adds a single [Format] to [formats].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormat(format: Format) = apply { body.addFormat(format) }

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
         * Maximum content length for the URL response. Accepts either:
         * - Integer: bytes (e.g., 8388608 for 8MB)
         * - String: size format with unit (e.g., "1kb", "55mb", "1.2gb") Supported units: b
         *   (bytes), kb (kilobytes), mb (megabytes), gb (gigabytes), tb (terabytes) Must be between
         *   1KB and 8MB. Defaults to "8mb" (8MB) if not specified.
         */
        fun maxSize(maxSize: MaxSize) = apply { body.maxSize(maxSize) }

        /**
         * Sets [Builder.maxSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSize] with a well-typed [MaxSize] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxSize(maxSize: JsonField<MaxSize>) = apply { body.maxSize(maxSize) }

        /** Alias for calling [maxSize] with `MaxSize.ofInteger(integer)`. */
        fun maxSize(integer: Long) = apply { body.maxSize(integer) }

        /** Alias for calling [maxSize] with `MaxSize.ofString(string)`. */
        fun maxSize(string: String) = apply { body.maxSize(string) }

        /**
         * Maximum time before the crawler gives up on loading a URL. Accepts either:
         * - Integer: milliseconds (e.g., 15000 for 15 seconds)
         * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
         *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 1 second
         *   and 30 seconds. Defaults to "10s" (10 seconds) if not specified.
         */
        fun maxTimeout(maxTimeout: MaxTimeout) = apply { body.maxTimeout(maxTimeout) }

        /**
         * Sets [Builder.maxTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTimeout] with a well-typed [MaxTimeout] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxTimeout(maxTimeout: JsonField<MaxTimeout>) = apply { body.maxTimeout(maxTimeout) }

        /** Alias for calling [maxTimeout] with `MaxTimeout.ofInteger(integer)`. */
        fun maxTimeout(integer: Long) = apply { body.maxTimeout(integer) }

        /** Alias for calling [maxTimeout] with `MaxTimeout.ofString(string)`. */
        fun maxTimeout(string: String) = apply { body.maxTimeout(string) }

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
         * set, it will be ignored. Defaults to false if not specified. Note: Enabling stealthMode
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
         * Returns an immutable instance of [ExtractFromUrlParams].
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
        fun build(): ExtractFromUrlParams =
            ExtractFromUrlParams(
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
        private val cacheAge: JsonField<CacheAge>,
        private val cleanText: JsonField<Boolean>,
        private val formats: JsonField<List<Format>>,
        private val headers: JsonField<Headers>,
        private val maxRedirects: JsonField<Long>,
        private val maxSize: JsonField<MaxSize>,
        private val maxTimeout: JsonField<MaxTimeout>,
        private val proxy: JsonField<Proxy>,
        private val stealthMode: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cacheAge")
            @ExcludeMissing
            cacheAge: JsonField<CacheAge> = JsonMissing.of(),
            @JsonProperty("cleanText")
            @ExcludeMissing
            cleanText: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("formats")
            @ExcludeMissing
            formats: JsonField<List<Format>> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
            @JsonProperty("maxRedirects")
            @ExcludeMissing
            maxRedirects: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("maxSize") @ExcludeMissing maxSize: JsonField<MaxSize> = JsonMissing.of(),
            @JsonProperty("maxTimeout")
            @ExcludeMissing
            maxTimeout: JsonField<MaxTimeout> = JsonMissing.of(),
            @JsonProperty("proxy") @ExcludeMissing proxy: JsonField<Proxy> = JsonMissing.of(),
            @JsonProperty("stealthMode")
            @ExcludeMissing
            stealthMode: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            url,
            cacheAge,
            cleanText,
            formats,
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
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Maximum acceptable age of cached content. This parameter controls how fresh cached data
         * must be to be used.
         * - If a cached item exists and is younger than this value, it will be used (cache hit)
         * - If a cached item exists but is older than this value, it will be ignored and fresh data
         *   will be fetched (cache miss)
         * - If set to 0, caching is disabled for this request (always fetches fresh data)
         * - When fresh data is fetched, it will be cached with this value as the TTL for future
         *   requests Accepts either:
         * - Integer: milliseconds (e.g., 86400000 for 1 day)
         * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h", "2d") Supported units: s
         *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 0 (no
         *   caching) and 3 days. Defaults to "2d" (2 days) if not specified. Examples:
         * - "1s": Only use cached items less than 1 second old; fetch fresh data if cache is older
         * - "1h": Only use cached items less than 1 hour old; fetch fresh data if cache is older
         * - 0: Disable caching entirely; always fetch fresh data
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cacheAge(): Optional<CacheAge> = cacheAge.getOptional("cacheAge")

        /**
         * Whether to clean extracted text
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cleanText(): Optional<Boolean> = cleanText.getOptional("cleanText")

        /**
         * Array of output formats to include in the response. Options: 'text', 'markdown'.
         * - 'text': Extracted plain text (always available)
         * - 'markdown': Markdown representation (only available for HTML content, empty string
         *   otherwise) Defaults to ['text'] if not specified.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun formats(): Optional<List<Format>> = formats.getOptional("formats")

        /**
         * Custom HTTP headers to send with the request (case-insensitive)
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * Maximum number of redirects to follow when fetching the URL. Must be between 0 (no
         * redirects) and 20. Defaults to 5 if not specified.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxRedirects(): Optional<Long> = maxRedirects.getOptional("maxRedirects")

        /**
         * Maximum content length for the URL response. Accepts either:
         * - Integer: bytes (e.g., 8388608 for 8MB)
         * - String: size format with unit (e.g., "1kb", "55mb", "1.2gb") Supported units: b
         *   (bytes), kb (kilobytes), mb (megabytes), gb (gigabytes), tb (terabytes) Must be between
         *   1KB and 8MB. Defaults to "8mb" (8MB) if not specified.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxSize(): Optional<MaxSize> = maxSize.getOptional("maxSize")

        /**
         * Maximum time before the crawler gives up on loading a URL. Accepts either:
         * - Integer: milliseconds (e.g., 15000 for 15 seconds)
         * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
         *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 1 second
         *   and 30 seconds. Defaults to "10s" (10 seconds) if not specified.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxTimeout(): Optional<MaxTimeout> = maxTimeout.getOptional("maxTimeout")

        /**
         * Proxy configuration for the request
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun proxy(): Optional<Proxy> = proxy.getOptional("proxy")

        /**
         * When enabled, we use a proxy for the request. If set to true, and the 'proxy' option is
         * set, it will be ignored. Defaults to false if not specified. Note: Enabling stealthMode
         * consumes an additional credit/quota point (2 credits total instead of 1) for this
         * request.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stealthMode(): Optional<Boolean> = stealthMode.getOptional("stealthMode")

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
        @JsonProperty("cacheAge") @ExcludeMissing fun _cacheAge(): JsonField<CacheAge> = cacheAge

        /**
         * Returns the raw JSON value of [cleanText].
         *
         * Unlike [cleanText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cleanText") @ExcludeMissing fun _cleanText(): JsonField<Boolean> = cleanText

        /**
         * Returns the raw JSON value of [formats].
         *
         * Unlike [formats], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("formats") @ExcludeMissing fun _formats(): JsonField<List<Format>> = formats

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
        @JsonProperty("maxRedirects")
        @ExcludeMissing
        fun _maxRedirects(): JsonField<Long> = maxRedirects

        /**
         * Returns the raw JSON value of [maxSize].
         *
         * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxSize") @ExcludeMissing fun _maxSize(): JsonField<MaxSize> = maxSize

        /**
         * Returns the raw JSON value of [maxTimeout].
         *
         * Unlike [maxTimeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxTimeout")
        @ExcludeMissing
        fun _maxTimeout(): JsonField<MaxTimeout> = maxTimeout

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
        @JsonProperty("stealthMode")
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
            private var cacheAge: JsonField<CacheAge> = JsonMissing.of()
            private var cleanText: JsonField<Boolean> = JsonMissing.of()
            private var formats: JsonField<MutableList<Format>>? = null
            private var headers: JsonField<Headers> = JsonMissing.of()
            private var maxRedirects: JsonField<Long> = JsonMissing.of()
            private var maxSize: JsonField<MaxSize> = JsonMissing.of()
            private var maxTimeout: JsonField<MaxTimeout> = JsonMissing.of()
            private var proxy: JsonField<Proxy> = JsonMissing.of()
            private var stealthMode: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                url = body.url
                cacheAge = body.cacheAge
                cleanText = body.cleanText
                formats = body.formats.map { it.toMutableList() }
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
             * Maximum acceptable age of cached content. This parameter controls how fresh cached
             * data must be to be used.
             * - If a cached item exists and is younger than this value, it will be used (cache hit)
             * - If a cached item exists but is older than this value, it will be ignored and fresh
             *   data will be fetched (cache miss)
             * - If set to 0, caching is disabled for this request (always fetches fresh data)
             * - When fresh data is fetched, it will be cached with this value as the TTL for future
             *   requests Accepts either:
             * - Integer: milliseconds (e.g., 86400000 for 1 day)
             * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h", "2d") Supported
             *   units: s (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be
             *   between 0 (no caching) and 3 days. Defaults to "2d" (2 days) if not specified.
             *   Examples:
             * - "1s": Only use cached items less than 1 second old; fetch fresh data if cache is
             *   older
             * - "1h": Only use cached items less than 1 hour old; fetch fresh data if cache is
             *   older
             * - 0: Disable caching entirely; always fetch fresh data
             */
            fun cacheAge(cacheAge: CacheAge) = cacheAge(JsonField.of(cacheAge))

            /**
             * Sets [Builder.cacheAge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheAge] with a well-typed [CacheAge] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cacheAge(cacheAge: JsonField<CacheAge>) = apply { this.cacheAge = cacheAge }

            /** Alias for calling [cacheAge] with `CacheAge.ofInteger(integer)`. */
            fun cacheAge(integer: Long) = cacheAge(CacheAge.ofInteger(integer))

            /** Alias for calling [cacheAge] with `CacheAge.ofString(string)`. */
            fun cacheAge(string: String) = cacheAge(CacheAge.ofString(string))

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
             * Array of output formats to include in the response. Options: 'text', 'markdown'.
             * - 'text': Extracted plain text (always available)
             * - 'markdown': Markdown representation (only available for HTML content, empty string
             *   otherwise) Defaults to ['text'] if not specified.
             */
            fun formats(formats: List<Format>) = formats(JsonField.of(formats))

            /**
             * Sets [Builder.formats] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formats] with a well-typed `List<Format>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun formats(formats: JsonField<List<Format>>) = apply {
                this.formats = formats.map { it.toMutableList() }
            }

            /**
             * Adds a single [Format] to [formats].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFormat(format: Format) = apply {
                formats =
                    (formats ?: JsonField.of(mutableListOf())).also {
                        checkKnown("formats", it).add(format)
                    }
            }

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
             * Maximum content length for the URL response. Accepts either:
             * - Integer: bytes (e.g., 8388608 for 8MB)
             * - String: size format with unit (e.g., "1kb", "55mb", "1.2gb") Supported units: b
             *   (bytes), kb (kilobytes), mb (megabytes), gb (gigabytes), tb (terabytes) Must be
             *   between 1KB and 8MB. Defaults to "8mb" (8MB) if not specified.
             */
            fun maxSize(maxSize: MaxSize) = maxSize(JsonField.of(maxSize))

            /**
             * Sets [Builder.maxSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSize] with a well-typed [MaxSize] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSize(maxSize: JsonField<MaxSize>) = apply { this.maxSize = maxSize }

            /** Alias for calling [maxSize] with `MaxSize.ofInteger(integer)`. */
            fun maxSize(integer: Long) = maxSize(MaxSize.ofInteger(integer))

            /** Alias for calling [maxSize] with `MaxSize.ofString(string)`. */
            fun maxSize(string: String) = maxSize(MaxSize.ofString(string))

            /**
             * Maximum time before the crawler gives up on loading a URL. Accepts either:
             * - Integer: milliseconds (e.g., 15000 for 15 seconds)
             * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
             *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 1
             *   second and 30 seconds. Defaults to "10s" (10 seconds) if not specified.
             */
            fun maxTimeout(maxTimeout: MaxTimeout) = maxTimeout(JsonField.of(maxTimeout))

            /**
             * Sets [Builder.maxTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTimeout] with a well-typed [MaxTimeout] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTimeout(maxTimeout: JsonField<MaxTimeout>) = apply {
                this.maxTimeout = maxTimeout
            }

            /** Alias for calling [maxTimeout] with `MaxTimeout.ofInteger(integer)`. */
            fun maxTimeout(integer: Long) = maxTimeout(MaxTimeout.ofInteger(integer))

            /** Alias for calling [maxTimeout] with `MaxTimeout.ofString(string)`. */
            fun maxTimeout(string: String) = maxTimeout(MaxTimeout.ofString(string))

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
             * stealthMode consumes an additional credit/quota point (2 credits total instead of 1)
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
                    (formats ?: JsonMissing.of()).map { it.toImmutable() },
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
            cacheAge().ifPresent { it.validate() }
            cleanText()
            formats().ifPresent { it.forEach { it.validate() } }
            headers().ifPresent { it.validate() }
            maxRedirects()
            maxSize().ifPresent { it.validate() }
            maxTimeout().ifPresent { it.validate() }
            proxy().ifPresent { it.validate() }
            stealthMode()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ApiCrawlerDevSdksInvalidDataException) {
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
                (cacheAge.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cleanText.asKnown().isPresent) 1 else 0) +
                (formats.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxRedirects.asKnown().isPresent) 1 else 0) +
                (maxSize.asKnown().getOrNull()?.validity() ?: 0) +
                (maxTimeout.asKnown().getOrNull()?.validity() ?: 0) +
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
                formats == other.formats &&
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
                formats,
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
            "Body{url=$url, cacheAge=$cacheAge, cleanText=$cleanText, formats=$formats, headers=$headers, maxRedirects=$maxRedirects, maxSize=$maxSize, maxTimeout=$maxTimeout, proxy=$proxy, stealthMode=$stealthMode, additionalProperties=$additionalProperties}"
    }

    /**
     * Maximum acceptable age of cached content. This parameter controls how fresh cached data must
     * be to be used.
     * - If a cached item exists and is younger than this value, it will be used (cache hit)
     * - If a cached item exists but is older than this value, it will be ignored and fresh data
     *   will be fetched (cache miss)
     * - If set to 0, caching is disabled for this request (always fetches fresh data)
     * - When fresh data is fetched, it will be cached with this value as the TTL for future
     *   requests Accepts either:
     * - Integer: milliseconds (e.g., 86400000 for 1 day)
     * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h", "2d") Supported units: s
     *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 0 (no
     *   caching) and 3 days. Defaults to "2d" (2 days) if not specified. Examples:
     * - "1s": Only use cached items less than 1 second old; fetch fresh data if cache is older
     * - "1h": Only use cached items less than 1 hour old; fetch fresh data if cache is older
     * - 0: Disable caching entirely; always fetch fresh data
     */
    @JsonDeserialize(using = CacheAge.Deserializer::class)
    @JsonSerialize(using = CacheAge.Serializer::class)
    class CacheAge
    private constructor(
        private val integer: Long? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isInteger(): Boolean = integer != null

        fun isString(): Boolean = string != null

        fun asInteger(): Long = integer.getOrThrow("integer")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                integer != null -> visitor.visitInteger(integer)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CacheAge = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInteger(integer: Long) {}

                    override fun visitString(string: String) {}
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ApiCrawlerDevSdksInvalidDataException) {
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
            accept(
                object : Visitor<Int> {
                    override fun visitInteger(integer: Long) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CacheAge && integer == other.integer && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(integer, string)

        override fun toString(): String =
            when {
                integer != null -> "CacheAge{integer=$integer}"
                string != null -> "CacheAge{string=$string}"
                _json != null -> "CacheAge{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CacheAge")
            }

        companion object {

            @JvmStatic fun ofInteger(integer: Long) = CacheAge(integer = integer)

            @JvmStatic fun ofString(string: String) = CacheAge(string = string)
        }

        /**
         * An interface that defines how to map each variant of [CacheAge] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitInteger(integer: Long): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [CacheAge] to a value of type [T].
             *
             * An instance of [CacheAge] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws ApiCrawlerDevSdksInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw ApiCrawlerDevSdksInvalidDataException("Unknown CacheAge: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<CacheAge>(CacheAge::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CacheAge {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                CacheAge(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                CacheAge(integer = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CacheAge(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CacheAge>(CacheAge::class) {

            override fun serialize(
                value: CacheAge,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.integer != null -> generator.writeObject(value.integer)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CacheAge")
                }
            }
        }
    }

    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TEXT = of("text")

            @JvmField val MARKDOWN = of("markdown")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            TEXT,
            MARKDOWN,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEXT,
            MARKDOWN,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TEXT -> Value.TEXT
                MARKDOWN -> Value.MARKDOWN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                TEXT -> Known.TEXT
                MARKDOWN -> Known.MARKDOWN
                else -> throw ApiCrawlerDevSdksInvalidDataException("Unknown Format: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ApiCrawlerDevSdksInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Format = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ApiCrawlerDevSdksInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
            } catch (e: ApiCrawlerDevSdksInvalidDataException) {
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

    /**
     * Maximum content length for the URL response. Accepts either:
     * - Integer: bytes (e.g., 8388608 for 8MB)
     * - String: size format with unit (e.g., "1kb", "55mb", "1.2gb") Supported units: b (bytes), kb
     *   (kilobytes), mb (megabytes), gb (gigabytes), tb (terabytes) Must be between 1KB and 8MB.
     *   Defaults to "8mb" (8MB) if not specified.
     */
    @JsonDeserialize(using = MaxSize.Deserializer::class)
    @JsonSerialize(using = MaxSize.Serializer::class)
    class MaxSize
    private constructor(
        private val integer: Long? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isInteger(): Boolean = integer != null

        fun isString(): Boolean = string != null

        fun asInteger(): Long = integer.getOrThrow("integer")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                integer != null -> visitor.visitInteger(integer)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): MaxSize = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInteger(integer: Long) {}

                    override fun visitString(string: String) {}
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ApiCrawlerDevSdksInvalidDataException) {
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
            accept(
                object : Visitor<Int> {
                    override fun visitInteger(integer: Long) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MaxSize && integer == other.integer && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(integer, string)

        override fun toString(): String =
            when {
                integer != null -> "MaxSize{integer=$integer}"
                string != null -> "MaxSize{string=$string}"
                _json != null -> "MaxSize{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MaxSize")
            }

        companion object {

            @JvmStatic fun ofInteger(integer: Long) = MaxSize(integer = integer)

            @JvmStatic fun ofString(string: String) = MaxSize(string = string)
        }

        /**
         * An interface that defines how to map each variant of [MaxSize] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitInteger(integer: Long): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [MaxSize] to a value of type [T].
             *
             * An instance of [MaxSize] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws ApiCrawlerDevSdksInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw ApiCrawlerDevSdksInvalidDataException("Unknown MaxSize: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<MaxSize>(MaxSize::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MaxSize {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                MaxSize(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                MaxSize(integer = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> MaxSize(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<MaxSize>(MaxSize::class) {

            override fun serialize(
                value: MaxSize,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.integer != null -> generator.writeObject(value.integer)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MaxSize")
                }
            }
        }
    }

    /**
     * Maximum time before the crawler gives up on loading a URL. Accepts either:
     * - Integer: milliseconds (e.g., 15000 for 15 seconds)
     * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
     *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 1 second and
     *   30 seconds. Defaults to "10s" (10 seconds) if not specified.
     */
    @JsonDeserialize(using = MaxTimeout.Deserializer::class)
    @JsonSerialize(using = MaxTimeout.Serializer::class)
    class MaxTimeout
    private constructor(
        private val integer: Long? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isInteger(): Boolean = integer != null

        fun isString(): Boolean = string != null

        fun asInteger(): Long = integer.getOrThrow("integer")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                integer != null -> visitor.visitInteger(integer)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): MaxTimeout = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInteger(integer: Long) {}

                    override fun visitString(string: String) {}
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ApiCrawlerDevSdksInvalidDataException) {
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
            accept(
                object : Visitor<Int> {
                    override fun visitInteger(integer: Long) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MaxTimeout && integer == other.integer && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(integer, string)

        override fun toString(): String =
            when {
                integer != null -> "MaxTimeout{integer=$integer}"
                string != null -> "MaxTimeout{string=$string}"
                _json != null -> "MaxTimeout{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MaxTimeout")
            }

        companion object {

            @JvmStatic fun ofInteger(integer: Long) = MaxTimeout(integer = integer)

            @JvmStatic fun ofString(string: String) = MaxTimeout(string = string)
        }

        /**
         * An interface that defines how to map each variant of [MaxTimeout] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitInteger(integer: Long): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [MaxTimeout] to a value of type [T].
             *
             * An instance of [MaxTimeout] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws ApiCrawlerDevSdksInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw ApiCrawlerDevSdksInvalidDataException("Unknown MaxTimeout: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<MaxTimeout>(MaxTimeout::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MaxTimeout {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                MaxTimeout(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                MaxTimeout(integer = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> MaxTimeout(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<MaxTimeout>(MaxTimeout::class) {

            override fun serialize(
                value: MaxTimeout,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.integer != null -> generator.writeObject(value.integer)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MaxTimeout")
                }
            }
        }
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
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun password(): Optional<String> = password.getOptional("password")

        /**
         * Proxy server URL (e.g., http://proxy.example.com:8080 or socks5://proxy.example.com:1080)
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun server(): Optional<String> = server.getOptional("server")

        /**
         * Proxy username for authentication
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
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
            } catch (e: ApiCrawlerDevSdksInvalidDataException) {
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

        return other is ExtractFromUrlParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExtractFromUrlParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
