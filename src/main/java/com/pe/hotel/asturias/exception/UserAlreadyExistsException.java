package com.pe.hotel.asturias.exception;

/**
 * @author Brayan Torres
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
