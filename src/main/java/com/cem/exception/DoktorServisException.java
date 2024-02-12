package com.cem.exception;

import lombok.Getter;

@Getter
public class DoktorServisException extends RuntimeException{

    private final ErrorType errorType;
    public DoktorServisException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public DoktorServisException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }

}
