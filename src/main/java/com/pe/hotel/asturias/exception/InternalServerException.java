package com.pe.hotel.asturias.exception;

/**
 * @author Brayan Torres
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
