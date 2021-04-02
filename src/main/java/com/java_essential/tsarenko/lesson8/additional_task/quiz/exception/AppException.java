package com.java_essential.tsarenko.lesson8.additional_task.quiz.exception;

public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
