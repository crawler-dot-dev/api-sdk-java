// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.models.extract

import com.configure_me_apicrawlerdev_sdks.api.core.BaseSerializer
import com.configure_me_apicrawlerdev_sdks.api.core.Enum
import com.configure_me_apicrawlerdev_sdks.api.core.ExcludeMissing
import com.configure_me_apicrawlerdev_sdks.api.core.JsonField
import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue
import com.configure_me_apicrawlerdev_sdks.api.core.MultipartField
import com.configure_me_apicrawlerdev_sdks.api.core.Params
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
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * Upload a file and extract text content from it. Supports PDF, DOC, DOCX, TXT and other
 * text-extractable document formats.
 */
class ExtractFromFileParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The file to upload.
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * Whether to clean and normalize the extracted text. When enabled (true):
     * - For HTML content: Removes script, style, and other non-text elements before extraction
     * - Normalizes whitespace (collapses multiple spaces/tabs, normalizes newlines)
     * - Removes empty lines and trims leading/trailing whitespace
     * - Normalizes Unicode characters (NFC)
     * - For JSON content: Only minimal cleaning to preserve structure When disabled (false):
     *   Returns raw extracted text without any processing.
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
     * Maximum time before the file extraction gives up. Accepts either:
     * - Integer: milliseconds (e.g., 30000 for 30 seconds)
     * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
     *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 5 seconds
     *   and 2 minutes. Defaults to "30s" (30 seconds) if not specified. This controls the timeout
     *   for Tika extraction operations on uploaded files.
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxTimeout(): Optional<MaxTimeout> = body.maxTimeout()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [cleanText].
     *
     * Unlike [cleanText], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _cleanText(): MultipartField<Boolean> = body._cleanText()

    /**
     * Returns the raw multipart value of [formats].
     *
     * Unlike [formats], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _formats(): MultipartField<List<Format>> = body._formats()

    /**
     * Returns the raw multipart value of [maxTimeout].
     *
     * Unlike [maxTimeout], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _maxTimeout(): MultipartField<MaxTimeout> = body._maxTimeout()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExtractFromFileParams].
         *
         * The following fields are required:
         * ```java
         * .file()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractFromFileParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(extractFromFileParams: ExtractFromFileParams) = apply {
            body = extractFromFileParams.body.toBuilder()
            additionalHeaders = extractFromFileParams.additionalHeaders.toBuilder()
            additionalQueryParams = extractFromFileParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [file]
         * - [cleanText]
         * - [formats]
         * - [maxTimeout]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The file to upload. */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /** The file to upload. */
        fun file(file: ByteArray) = apply { body.file(file) }

        /** The file to upload. */
        fun file(path: Path) = apply { body.file(path) }

        /**
         * Whether to clean and normalize the extracted text. When enabled (true):
         * - For HTML content: Removes script, style, and other non-text elements before extraction
         * - Normalizes whitespace (collapses multiple spaces/tabs, normalizes newlines)
         * - Removes empty lines and trims leading/trailing whitespace
         * - Normalizes Unicode characters (NFC)
         * - For JSON content: Only minimal cleaning to preserve structure When disabled (false):
         *   Returns raw extracted text without any processing.
         */
        fun cleanText(cleanText: Boolean) = apply { body.cleanText(cleanText) }

        /**
         * Sets [Builder.cleanText] to an arbitrary multipart value.
         *
         * You should usually call [Builder.cleanText] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cleanText(cleanText: MultipartField<Boolean>) = apply { body.cleanText(cleanText) }

        /**
         * Array of output formats to include in the response. Options: 'text', 'markdown'.
         * - 'text': Extracted plain text (always available)
         * - 'markdown': Markdown representation (only available for HTML content, empty string
         *   otherwise) Defaults to ['text'] if not specified.
         */
        fun formats(formats: List<Format>) = apply { body.formats(formats) }

        /**
         * Sets [Builder.formats] to an arbitrary multipart value.
         *
         * You should usually call [Builder.formats] with a well-typed `List<Format>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formats(formats: MultipartField<List<Format>>) = apply { body.formats(formats) }

        /**
         * Adds a single [Format] to [formats].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormat(format: Format) = apply { body.addFormat(format) }

        /**
         * Maximum time before the file extraction gives up. Accepts either:
         * - Integer: milliseconds (e.g., 30000 for 30 seconds)
         * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
         *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 5
         *   seconds and 2 minutes. Defaults to "30s" (30 seconds) if not specified. This controls
         *   the timeout for Tika extraction operations on uploaded files.
         */
        fun maxTimeout(maxTimeout: MaxTimeout) = apply { body.maxTimeout(maxTimeout) }

        /**
         * Sets [Builder.maxTimeout] to an arbitrary multipart value.
         *
         * You should usually call [Builder.maxTimeout] with a well-typed [MaxTimeout] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxTimeout(maxTimeout: MultipartField<MaxTimeout>) = apply {
            body.maxTimeout(maxTimeout)
        }

        /** Alias for calling [maxTimeout] with `MaxTimeout.ofInteger(integer)`. */
        fun maxTimeout(integer: Long) = apply { body.maxTimeout(integer) }

        /** Alias for calling [maxTimeout] with `MaxTimeout.ofString(string)`. */
        fun maxTimeout(string: String) = apply { body.maxTimeout(string) }

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
         * Returns an immutable instance of [ExtractFromFileParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .file()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtractFromFileParams =
            ExtractFromFileParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "file" to _file(),
                "cleanText" to _cleanText(),
                "formats" to _formats(),
                "maxTimeout" to _maxTimeout(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val file: MultipartField<InputStream>,
        private val cleanText: MultipartField<Boolean>,
        private val formats: MultipartField<List<Format>>,
        private val maxTimeout: MultipartField<MaxTimeout>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The file to upload.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * Whether to clean and normalize the extracted text. When enabled (true):
         * - For HTML content: Removes script, style, and other non-text elements before extraction
         * - Normalizes whitespace (collapses multiple spaces/tabs, normalizes newlines)
         * - Removes empty lines and trims leading/trailing whitespace
         * - Normalizes Unicode characters (NFC)
         * - For JSON content: Only minimal cleaning to preserve structure When disabled (false):
         *   Returns raw extracted text without any processing.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cleanText(): Optional<Boolean> = cleanText.value.getOptional("cleanText")

        /**
         * Array of output formats to include in the response. Options: 'text', 'markdown'.
         * - 'text': Extracted plain text (always available)
         * - 'markdown': Markdown representation (only available for HTML content, empty string
         *   otherwise) Defaults to ['text'] if not specified.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun formats(): Optional<List<Format>> = formats.value.getOptional("formats")

        /**
         * Maximum time before the file extraction gives up. Accepts either:
         * - Integer: milliseconds (e.g., 30000 for 30 seconds)
         * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
         *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 5
         *   seconds and 2 minutes. Defaults to "30s" (30 seconds) if not specified. This controls
         *   the timeout for Tika extraction operations on uploaded files.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxTimeout(): Optional<MaxTimeout> = maxTimeout.value.getOptional("maxTimeout")

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [cleanText].
         *
         * Unlike [cleanText], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("cleanText")
        @ExcludeMissing
        fun _cleanText(): MultipartField<Boolean> = cleanText

        /**
         * Returns the raw multipart value of [formats].
         *
         * Unlike [formats], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("formats")
        @ExcludeMissing
        fun _formats(): MultipartField<List<Format>> = formats

        /**
         * Returns the raw multipart value of [maxTimeout].
         *
         * Unlike [maxTimeout], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("maxTimeout")
        @ExcludeMissing
        fun _maxTimeout(): MultipartField<MaxTimeout> = maxTimeout

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
             * .file()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var file: MultipartField<InputStream>? = null
            private var cleanText: MultipartField<Boolean> = MultipartField.of(null)
            private var formats: MultipartField<MutableList<Format>>? = null
            private var maxTimeout: MultipartField<MaxTimeout> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                file = body.file
                cleanText = body.cleanText
                formats = body.formats.map { it.toMutableList() }
                maxTimeout = body.maxTimeout
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The file to upload. */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /** The file to upload. */
            fun file(file: ByteArray) = file(file.inputStream())

            /** The file to upload. */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /**
             * Whether to clean and normalize the extracted text. When enabled (true):
             * - For HTML content: Removes script, style, and other non-text elements before
             *   extraction
             * - Normalizes whitespace (collapses multiple spaces/tabs, normalizes newlines)
             * - Removes empty lines and trims leading/trailing whitespace
             * - Normalizes Unicode characters (NFC)
             * - For JSON content: Only minimal cleaning to preserve structure When disabled
             *   (false): Returns raw extracted text without any processing.
             */
            fun cleanText(cleanText: Boolean) = cleanText(MultipartField.of(cleanText))

            /**
             * Sets [Builder.cleanText] to an arbitrary multipart value.
             *
             * You should usually call [Builder.cleanText] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cleanText(cleanText: MultipartField<Boolean>) = apply { this.cleanText = cleanText }

            /**
             * Array of output formats to include in the response. Options: 'text', 'markdown'.
             * - 'text': Extracted plain text (always available)
             * - 'markdown': Markdown representation (only available for HTML content, empty string
             *   otherwise) Defaults to ['text'] if not specified.
             */
            fun formats(formats: List<Format>) = formats(MultipartField.of(formats))

            /**
             * Sets [Builder.formats] to an arbitrary multipart value.
             *
             * You should usually call [Builder.formats] with a well-typed `List<Format>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun formats(formats: MultipartField<List<Format>>) = apply {
                this.formats = formats.map { it.toMutableList() }
            }

            /**
             * Adds a single [Format] to [formats].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFormat(format: Format) = apply {
                formats =
                    (formats ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("formats", it).add(format)
                    }
            }

            /**
             * Maximum time before the file extraction gives up. Accepts either:
             * - Integer: milliseconds (e.g., 30000 for 30 seconds)
             * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
             *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 5
             *   seconds and 2 minutes. Defaults to "30s" (30 seconds) if not specified. This
             *   controls the timeout for Tika extraction operations on uploaded files.
             */
            fun maxTimeout(maxTimeout: MaxTimeout) = maxTimeout(MultipartField.of(maxTimeout))

            /**
             * Sets [Builder.maxTimeout] to an arbitrary multipart value.
             *
             * You should usually call [Builder.maxTimeout] with a well-typed [MaxTimeout] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTimeout(maxTimeout: MultipartField<MaxTimeout>) = apply {
                this.maxTimeout = maxTimeout
            }

            /** Alias for calling [maxTimeout] with `MaxTimeout.ofInteger(integer)`. */
            fun maxTimeout(integer: Long) = maxTimeout(MaxTimeout.ofInteger(integer))

            /** Alias for calling [maxTimeout] with `MaxTimeout.ofString(string)`. */
            fun maxTimeout(string: String) = maxTimeout(MaxTimeout.ofString(string))

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
             * .file()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("file", file),
                    cleanText,
                    (formats ?: MultipartField.of(null)).map { it.toImmutable() },
                    maxTimeout,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            file()
            cleanText()
            formats().ifPresent { it.forEach { it.validate() } }
            maxTimeout().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ApiCrawlerDevSdksInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                file == other.file &&
                cleanText == other.cleanText &&
                formats == other.formats &&
                maxTimeout == other.maxTimeout &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(file, cleanText, formats, maxTimeout, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{file=$file, cleanText=$cleanText, formats=$formats, maxTimeout=$maxTimeout, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
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

    /**
     * Maximum time before the file extraction gives up. Accepts either:
     * - Integer: milliseconds (e.g., 30000 for 30 seconds)
     * - String: time format with unit (e.g., "1s", "5h", "3m", "4.4h") Supported units: s
     *   (seconds), m (minutes), h (hours), d (days), ms (milliseconds) Must be between 5 seconds
     *   and 2 minutes. Defaults to "30s" (30 seconds) if not specified. This controls the timeout
     *   for Tika extraction operations on uploaded files.
     */
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

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = maxTimeout.accept(new MaxTimeout.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitInteger(Long integer) {
         *         return Optional.of(integer.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                integer != null -> visitor.visitInteger(integer)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ApiCrawlerDevSdksInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractFromFileParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExtractFromFileParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
