package com.pe.hotel.asturias.service;

import com.pe.hotel.asturias.model.User;

import java.util.List;

/**
 * @author Brayan Torres
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
