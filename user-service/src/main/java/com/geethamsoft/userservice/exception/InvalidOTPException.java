package com.geethamsoft.userservice.exception;

public class InvalidOTPException extends RuntimeException {

    public InvalidOTPException(String message) {
        super(message);
    }
}
