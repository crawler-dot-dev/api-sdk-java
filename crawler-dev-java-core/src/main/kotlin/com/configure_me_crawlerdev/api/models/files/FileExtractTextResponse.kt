// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.models.files

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

class FileExtractTextResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contentType: JsonField<String>,
    private val extractedText: JsonField<String>,
    private val filename: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val success: JsonField<Boolean>,
    private val textLength: JsonField<Long>,
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
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sizeBytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("textLength") @ExcludeMissing textLength: JsonField<Long> = JsonMissing.of(),
    ) : this(contentType, extractedText, filename, sizeBytes, success, textLength, mutableMapOf())

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
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * @throws CrawlerDevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("sizeBytes")

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
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

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

        /** Returns a mutable builder for constructing an instance of [FileExtractTextResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileExtractTextResponse]. */
    class Builder internal constructor() {

        private var contentType: JsonField<String> = JsonMissing.of()
        private var extractedText: JsonField<String> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var sizeBytes: JsonField<Long> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var textLength: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileExtractTextResponse: FileExtractTextResponse) = apply {
            contentType = fileExtractTextResponse.contentType
            extractedText = fileExtractTextResponse.extractedText
            filename = fileExtractTextResponse.filename
            sizeBytes = fileExtractTextResponse.sizeBytes
            success = fileExtractTextResponse.success
            textLength = fileExtractTextResponse.textLength
            additionalProperties = fileExtractTextResponse.additionalProperties.toMutableMap()
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

        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

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
         * Returns an immutable instance of [FileExtractTextResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileExtractTextResponse =
            FileExtractTextResponse(
                contentType,
                extractedText,
                filename,
                sizeBytes,
                success,
                textLength,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileExtractTextResponse = apply {
        if (validated) {
            return@apply
        }

        contentType()
        extractedText()
        filename()
        sizeBytes()
        success()
        textLength()
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
            (if (filename.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (textLength.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileExtractTextResponse &&
            contentType == other.contentType &&
            extractedText == other.extractedText &&
            filename == other.filename &&
            sizeBytes == other.sizeBytes &&
            success == other.success &&
            textLength == other.textLength &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contentType,
            extractedText,
            filename,
            sizeBytes,
            success,
            textLength,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileExtractTextResponse{contentType=$contentType, extractedText=$extractedText, filename=$filename, sizeBytes=$sizeBytes, success=$success, textLength=$textLength, additionalProperties=$additionalProperties}"
}
