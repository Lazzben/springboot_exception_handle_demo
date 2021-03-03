package com.example.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    ResponseEntity<?> handleServiceException(ServiceException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(ex.getCode());
        errorResponse.setErrorType(ex.getErrorType());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setStatusCode(ex.getStatusCode());
        return ResponseEntity.status(ex.getStatusCode())
                .body(errorResponse);
    }
}
