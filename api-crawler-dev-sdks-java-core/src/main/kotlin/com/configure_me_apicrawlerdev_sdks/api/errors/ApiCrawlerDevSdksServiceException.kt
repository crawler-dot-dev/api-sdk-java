// File generated from our OpenAPI spec by Stainless.

package com.configure_me_apicrawlerdev_sdks.api.errors

import com.configure_me_apicrawlerdev_sdks.api.core.JsonValue
import com.configure_me_apicrawlerdev_sdks.api.core.http.Headers

abstract class ApiCrawlerDevSdksServiceException
protected constructor(message: String, cause: Throwable? = null) :
    ApiCrawlerDevSdksException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
