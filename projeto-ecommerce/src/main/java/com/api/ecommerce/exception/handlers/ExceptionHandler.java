package com.api.ecommerce.exception.handlers;

import com.api.ecommerce.dto.ExceptionDTO;
import com.api.ecommerce.exception.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ExceptionDTO> defaultHandler(UnauthorizedException e){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ExceptionDTO(HttpStatus.UNAUTHORIZED.name(), e.getMessage()));
    }

}

