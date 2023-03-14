package com.rest.jpademo.exceptions;

public class DomainInvariantException extends RuntimeException{

    public DomainInvariantException(String message){
        super(message);
    }
}
