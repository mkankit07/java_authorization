package com.authorization.exceptions;

public class InvalidArgumentException extends RuntimeException{
    public InvalidArgumentException(String message){
        super(message);
    }
}
