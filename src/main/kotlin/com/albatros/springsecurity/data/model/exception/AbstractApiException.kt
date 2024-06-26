package com.albatros.springsecurity.data.model.exception

import com.albatros.springsecurity.data.model.response.ApiResponse
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.http.HttpStatus

@JsonIgnoreProperties("cause", "stackTrace", "suppressed", "localizedMessage")
abstract class AbstractApiException : ApiResponse, Exception() {
    override val status: HttpStatus = HttpStatus.INTERNAL_SERVER_ERROR
    override val message: String
        get() = localizedMessage
}
