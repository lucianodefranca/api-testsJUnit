package com.lucianofranca.apitests.services;

import com.lucianofranca.apitests.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
