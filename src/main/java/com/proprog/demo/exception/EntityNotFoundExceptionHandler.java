package com.proprog.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EntityNotFoundExceptionHandler {
    @ExceptionHandler(value = {EntityNotFoundException.class})
    ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException exception) {
        return new ResponseEntity<>(
                new EntityCustomErrorResponse(
                        exception.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        exception.getCause()
                ),
                HttpStatus.NOT_FOUND
        );
    }
}
