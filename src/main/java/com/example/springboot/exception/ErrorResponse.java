package com.example.springboot.exception;

public class ErrorResponse {
    private String code;
    private String message;
    private int statusCode;
    private ServiceException.ErrorType errorType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public ServiceException.ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ServiceException.ErrorType errorType) {
        this.errorType = errorType;
    }
}