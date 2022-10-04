package com.nguyenphitan.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

/**
 * Business Exception
 */
@Setter
@Getter
public class BusinessException extends RuntimeException {
    /**
     * Http status
     */
    private HttpStatus status;

    /**
     * Message for exception
     */
    private String message;

    /**
     * Detail message for exception
     */
    private String detail = "";

    /**
     * Error list
     */
    private String[] errors = new String[] {};

    /**
     * BusinessException
     * 
     * @param message String
     */
    public BusinessException(String message) {
        super(message);
        this.status = HttpStatus.BAD_REQUEST;
        this.message = message;
    }

    /**
     * BusinessException
     * 
     * @param message String
     * @param detail  String
     */
    public BusinessException(String message, String detail) {
        super(message);
        this.status = HttpStatus.BAD_REQUEST;
        this.message = message;
        this.detail = detail;
    }

    /**
     * BusinessException
     * 
     * @param message String
     * @param status  String
     */
    public BusinessException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.message = message;
    }

    /**
     * BusinessException
     * 
     * @param message String
     * @param status  String
     * @param errors  String
     */
    public BusinessException(String message, HttpStatus status, String[] errors) {
        super(message);
        this.status = status;
        this.message = message;
        this.errors = errors;
    }
}
