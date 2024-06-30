package com.pe.hotel.asturias.exception;

/**
 * @author Brayan Torres
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
