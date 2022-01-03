package com.lucianofranca.apitests.services;

import com.lucianofranca.apitests.domain.User;

public interface UserService {

    User findById(Integer id);
}
