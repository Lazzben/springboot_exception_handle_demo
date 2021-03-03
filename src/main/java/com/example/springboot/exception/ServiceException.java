package com.example.springboot.exception;

public class ServiceException extends RuntimeException {
    private int statusCode;
    private ServiceException.ErrorType errorType;
    private String code;

    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public ServiceException(String message) {
        super(message);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
