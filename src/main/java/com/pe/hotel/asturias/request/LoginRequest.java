package com.pe.hotel.asturias.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Brayan Torres
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
