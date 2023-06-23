package com.guru.spring5webapp.exception;

import org.springframework.http.HttpStatus;

public class Response {

    private HttpStatus statusCode;
    private String message;

    public Response() {
    }

    public Response(HttpStatus statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
