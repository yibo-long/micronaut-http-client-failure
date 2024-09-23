package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule

@Controller("/test")
@Secured(SecurityRule.IS_AUTHENTICATED)
class TestController {
    @Get("/", produces = [MediaType.TEXT_PLAIN])
    fun test(): String {
        return "Hello, World!"
    }
}
