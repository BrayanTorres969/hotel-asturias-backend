package com.pe.hotel.asturias.exception;

/**
 * @author Brayan Torres
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
