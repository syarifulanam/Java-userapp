package com.syariful.userapp.service;

import com.syariful.userapp.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getUsers();
}