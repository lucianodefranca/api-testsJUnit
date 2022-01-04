package com.lucianofranca.apitests.services;

import com.lucianofranca.apitests.domain.User;
import com.lucianofranca.apitests.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
