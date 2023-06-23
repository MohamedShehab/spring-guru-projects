package com.guru.spring5webapp.exception;

public class TaskAlreadyExists extends RuntimeException{

    public TaskAlreadyExists(String message) {
        super(message);
    }
}
