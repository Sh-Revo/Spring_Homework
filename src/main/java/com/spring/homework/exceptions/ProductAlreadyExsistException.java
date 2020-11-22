package com.spring.homework.exceptions;

public class ProductAlreadyExsistException extends RuntimeException {
    public ProductAlreadyExsistException(String message){
        super(message);
    }
}
