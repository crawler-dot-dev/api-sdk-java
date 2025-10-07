// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.models.urls

import com.configure_me_crawlerdev.api.core.ExcludeMissing
import com.configure_me_crawlerdev.api.core.JsonField
import com.configure_me_crawlerdev.api.core.JsonMissing
import com.configure_me_crawlerdev.api.core.JsonValue
import com.configure_me_crawlerdev.api.errors.CrawlerDevInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

class UrlExtractTextResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contentType: JsonField<String>,
    private val extractedText: JsonField<String>,
    private val finalUrl: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val statusCode: JsonField<Long>,
    private val success: JsonField<Boolean>,
    private val textLength: JsonField<Long>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contentType")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extractedText")
        @ExcludeMissing
        extractedText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("finalUrl") @ExcludeMissing finalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sizeBytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("statusCode") @ExcludeMissing statusCode: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("textLength") @ExcludeMissing textLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        contentType,
        extractedText,
        finalUrl,
        sizeBytes,
        statusCode,
        success,
        textLength,
        url,
        mutableMapOf(),
    )

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentType(): Optional<String> = contentType.getOptional("contentType")

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extractedText(): Optional<String> = extractedText.getOptional("extractedText")

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun finalUrl(): Optional<String> = finalUrl.getOptional("finalUrl")

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("sizeBytes")

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCode(): Optional<Long> = statusCode.getOptional("statusCode")

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textLength(): Optional<Long> = textLength.getOptional("textLength")

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentType") @ExcludeMissing fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [extractedText].
     *
     * Unlike [extractedText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extractedText")
    @ExcludeMissing
    fun _extractedText(): JsonField<String> = extractedText

    /**
     * Returns the raw JSON value of [finalUrl].
     *
     * Unlike [finalUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finalUrl") @ExcludeMissing fun _finalUrl(): JsonField<String> = finalUrl

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [statusCode].
     *
     * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusCode") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [textLength].
     *
     * Unlike [textLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("textLength") @ExcludeMissing fun _textLength(): JsonField<Long> = textLength

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

        /** Returns a mutable builder for constructing an instance of [UrlExtractTextResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UrlExtractTextResponse]. */
    class Builder internal constructor() {

        private var contentType: JsonField<String> = JsonMissing.of()
        private var extractedText: JsonField<String> = JsonMissing.of()
        private var finalUrl: JsonField<String> = JsonMissing.of()
        private var sizeBytes: JsonField<Long> = JsonMissing.of()
        private var statusCode: JsonField<Long> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var textLength: JsonField<Long> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(urlExtractTextResponse: UrlExtractTextResponse) = apply {
            contentType = urlExtractTextResponse.contentType
            extractedText = urlExtractTextResponse.extractedText
            finalUrl = urlExtractTextResponse.finalUrl
            sizeBytes = urlExtractTextResponse.sizeBytes
            statusCode = urlExtractTextResponse.statusCode
            success = urlExtractTextResponse.success
            textLength = urlExtractTextResponse.textLength
            url = urlExtractTextResponse.url
            additionalProperties = urlExtractTextResponse.additionalProperties.toMutableMap()
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

        fun extractedText(extractedText: String) = extractedText(JsonField.of(extractedText))

        /**
         * Sets [Builder.extractedText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extractedText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extractedText(extractedText: JsonField<String>) = apply {
            this.extractedText = extractedText
        }

        fun finalUrl(finalUrl: String) = finalUrl(JsonField.of(finalUrl))

        /**
         * Sets [Builder.finalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finalUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun finalUrl(finalUrl: JsonField<String>) = apply { this.finalUrl = finalUrl }

        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

        fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

        /**
         * Sets [Builder.statusCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCode] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        fun textLength(textLength: Long) = textLength(JsonField.of(textLength))

        /**
         * Sets [Builder.textLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textLength(textLength: JsonField<Long>) = apply { this.textLength = textLength }

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
         * Returns an immutable instance of [UrlExtractTextResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UrlExtractTextResponse =
            UrlExtractTextResponse(
                contentType,
                extractedText,
                finalUrl,
                sizeBytes,
                statusCode,
                success,
                textLength,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UrlExtractTextResponse = apply {
        if (validated) {
            return@apply
        }

        contentType()
        extractedText()
        finalUrl()
        sizeBytes()
        statusCode()
        success()
        textLength()
        url()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (contentType.asKnown().isPresent) 1 else 0) +
            (if (extractedText.asKnown().isPresent) 1 else 0) +
            (if (finalUrl.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (statusCode.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (textLength.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlExtractTextResponse &&
            contentType == other.contentType &&
            extractedText == other.extractedText &&
            finalUrl == other.finalUrl &&
            sizeBytes == other.sizeBytes &&
            statusCode == other.statusCode &&
            success == other.success &&
            textLength == other.textLength &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contentType,
            extractedText,
            finalUrl,
            sizeBytes,
            statusCode,
            success,
            textLength,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UrlExtractTextResponse{contentType=$contentType, extractedText=$extractedText, finalUrl=$finalUrl, sizeBytes=$sizeBytes, statusCode=$statusCode, success=$success, textLength=$textLength, url=$url, additionalProperties=$additionalProperties}"
}
