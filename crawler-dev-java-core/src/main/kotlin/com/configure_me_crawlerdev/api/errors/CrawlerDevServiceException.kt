// File generated from our OpenAPI spec by Stainless.

package com.configure_me_crawlerdev.api.errors

import com.configure_me_crawlerdev.api.core.JsonValue
import com.configure_me_crawlerdev.api.core.http.Headers

abstract class CrawlerDevServiceException
protected constructor(message: String, cause: Throwable? = null) :
    CrawlerDevException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
