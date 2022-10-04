package com.nguyenphitan.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

/**
 * Authentication Exception
 */
@Setter
@Getter
public class AuthenticationException extends RuntimeException {
    /**
     * Http status
     */
    private HttpStatus status;

    /**
     * Message for exception
     */
    private String message;

    /**
     * AuthenticationException
     * 
     * @param message String
     */
    public AuthenticationException(String message) {
        super(message);
        this.status = HttpStatus.UNAUTHORIZED;
        this.message = message;
    }

    /**
     * AuthenticationException
     * 
     * @param message String
     * @param status  HttpStatus
     */
    public AuthenticationException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.message = message;
    }
}
