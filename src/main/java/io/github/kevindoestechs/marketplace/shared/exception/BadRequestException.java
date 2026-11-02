package io.github.kevindoestechs.marketplace.shared.exception;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
