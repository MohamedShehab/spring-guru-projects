package com.guru.spring5webapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionHandlingControllerAdvice {

    @ExceptionHandler(TaskNotFound.class)
    public ResponseEntity<Response> taskNotFound(TaskNotFound exception) {
        return ResponseEntity.ok(new Response(HttpStatus.NOT_FOUND, "Task not found"));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Response> taskNotFound(IllegalArgumentException exception) {
        return ResponseEntity.ok(new Response(HttpStatus.OK, exception.getMessage()));
    }

    @ExceptionHandler(TaskAlreadyExists.class)
    public ResponseEntity<Response> taskNotFound(TaskAlreadyExists exception) {
        return ResponseEntity.ok(new Response(HttpStatus.OK, "Task with title already exists."));
    }

}
