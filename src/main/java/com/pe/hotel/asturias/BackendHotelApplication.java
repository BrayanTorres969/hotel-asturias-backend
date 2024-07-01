package com.pe.hotel.asturias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackendHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendHotelApplication.class, args);
    }

    @Configuration
    public static class Myconfiguration{
        @Bean
        public WebMvcConfigurer corsConfigurer(){
            return new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/**")
                            .allowedOrigins("https://hotel-asturias.vercel.app", "http://localhost:5173") // Agrega los dominios de tu frontend
                            .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH")
                            .allowedHeaders("*")  // Permite todos los headers
                            .allowCredentials(true); // Permite el uso de credenciales (opcional)
                }
            };
        }
    }

}
