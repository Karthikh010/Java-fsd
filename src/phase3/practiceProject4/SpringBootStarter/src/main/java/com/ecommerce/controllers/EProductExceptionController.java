package com.ecommerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecommerce.exceptions.ProductNotFouundException;

@ControllerAdvice
public class EProductExceptionController {

        @ExceptionHandler(value = ProductNotFouundException.class)
           public ResponseEntity<Object> exception(ProductNotFouundException exception) {
              return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
           }
}
