package com.pe.hotel.asturias.service;

import com.pe.hotel.asturias.model.Role;
import com.pe.hotel.asturias.model.User;

import java.util.List;

/**
 * @author Brayan Torres
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
