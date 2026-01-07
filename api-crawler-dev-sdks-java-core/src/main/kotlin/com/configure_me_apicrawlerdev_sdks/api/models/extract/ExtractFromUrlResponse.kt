// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.models.extract

import com.configure_me_apicrawlerdev_sdks.api.core.ExcludeMissing
import com.configure_me_apicrawlerdev_sdks.api.core.JsonField
import com.configure_me_apicrawlerdev_sdks.api.core.JsonMissing
import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue
import com.configure_me_apicrawlerdev_sdks.api.errors.ApiCrawlerDevSdksInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ExtractFromUrlResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contentType: JsonField<String>,
    private val finalUrl: JsonField<String>,
    private val markdown: JsonField<String>,
    private val size: JsonField<Long>,
    private val statusCode: JsonField<Long>,
    private val text: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contentType")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("finalUrl") @ExcludeMissing finalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("markdown") @ExcludeMissing markdown: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("statusCode") @ExcludeMissing statusCode: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(contentType, finalUrl, markdown, size, statusCode, text, url, mutableMapOf())

    /**
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun contentType(): Optional<String> = contentType.getOptional("contentType")

    /**
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun finalUrl(): Optional<String> = finalUrl.getOptional("finalUrl")

    /**
     * Markdown representation (included when 'markdown' is in formats array, empty string for
     * non-HTML content)
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun markdown(): Optional<String> = markdown.getOptional("markdown")

    /**
     * The size of the entity in bytes
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun size(): Optional<Long> = size.getOptional("size")

    /**
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun statusCode(): Optional<Long> = statusCode.getOptional("statusCode")

    /**
     * Extracted plain text (included when 'text' is in formats array)
     *
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * @throws ApiCrawlerDevSdksInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentType") @ExcludeMissing fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [finalUrl].
     *
     * Unlike [finalUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finalUrl") @ExcludeMissing fun _finalUrl(): JsonField<String> = finalUrl

    /**
     * Returns the raw JSON value of [markdown].
     *
     * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markdown") @ExcludeMissing fun _markdown(): JsonField<String> = markdown

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

    /**
     * Returns the raw JSON value of [statusCode].
     *
     * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusCode") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

        /** Returns a mutable builder for constructing an instance of [ExtractFromUrlResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractFromUrlResponse]. */
    class Builder internal constructor() {

        private var contentType: JsonField<String> = JsonMissing.of()
        private var finalUrl: JsonField<String> = JsonMissing.of()
        private var markdown: JsonField<String> = JsonMissing.of()
        private var size: JsonField<Long> = JsonMissing.of()
        private var statusCode: JsonField<Long> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractFromUrlResponse: ExtractFromUrlResponse) = apply {
            contentType = extractFromUrlResponse.contentType
            finalUrl = extractFromUrlResponse.finalUrl
            markdown = extractFromUrlResponse.markdown
            size = extractFromUrlResponse.size
            statusCode = extractFromUrlResponse.statusCode
            text = extractFromUrlResponse.text
            url = extractFromUrlResponse.url
            additionalProperties = extractFromUrlResponse.additionalProperties.toMutableMap()
        }

        fun contentType(contentType: String) = contentType(JsonField.of(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

        fun finalUrl(finalUrl: String) = finalUrl(JsonField.of(finalUrl))

        /**
         * Sets [Builder.finalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finalUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun finalUrl(finalUrl: JsonField<String>) = apply { this.finalUrl = finalUrl }

        /**
         * Markdown representation (included when 'markdown' is in formats array, empty string for
         * non-HTML content)
         */
        fun markdown(markdown: String) = markdown(JsonField.of(markdown))

        /**
         * Sets [Builder.markdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markdown] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

        /** The size of the entity in bytes */
        fun size(size: Long) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Long>) = apply { this.size = size }

        fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

        /**
         * Sets [Builder.statusCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCode] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

        /** Extracted plain text (included when 'text' is in formats array) */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [ExtractFromUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExtractFromUrlResponse =
            ExtractFromUrlResponse(
                contentType,
                finalUrl,
                markdown,
                size,
                statusCode,
                text,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExtractFromUrlResponse = apply {
        if (validated) {
            return@apply
        }

        contentType()
        finalUrl()
        markdown()
        size()
        statusCode()
        text()
        url()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (contentType.asKnown().isPresent) 1 else 0) +
            (if (finalUrl.asKnown().isPresent) 1 else 0) +
            (if (markdown.asKnown().isPresent) 1 else 0) +
            (if (size.asKnown().isPresent) 1 else 0) +
            (if (statusCode.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractFromUrlResponse &&
            contentType == other.contentType &&
            finalUrl == other.finalUrl &&
            markdown == other.markdown &&
            size == other.size &&
            statusCode == other.statusCode &&
            text == other.text &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contentType,
            finalUrl,
            markdown,
            size,
            statusCode,
            text,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractFromUrlResponse{contentType=$contentType, finalUrl=$finalUrl, markdown=$markdown, size=$size, statusCode=$statusCode, text=$text, url=$url, additionalProperties=$additionalProperties}"
}
