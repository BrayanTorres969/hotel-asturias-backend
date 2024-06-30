package com.pe.hotel.asturias.exception;

/**
 * @author Brayan Torres
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
