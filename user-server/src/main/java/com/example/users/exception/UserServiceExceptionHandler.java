package com.example.users.exception;

import com.example.users.dto.ErrorResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The Class AdminServiceExceptionHandler.
 */
@ControllerAdvice
public class UserServiceExceptionHandler {

    /**
     * Handle Data not found exception.
     *
     * @param e the e
     * @return the response entity
     */
    @ExceptionHandler
    public ResponseEntity<ErrorResponseModel> handleDataNotFoundException(DataNotFoundException e) {
        ErrorResponseModel errorResponseModel = new ErrorResponseModel();
        errorResponseModel.setMessage(e.getMessage());
        errorResponseModel.setErrorReportingTime(System.currentTimeMillis());
        errorResponseModel.setStatusCode(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponseModel);

    }
}
