package com.configure_me_crawlerdev.api.errors

open class CrawlerDevException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
