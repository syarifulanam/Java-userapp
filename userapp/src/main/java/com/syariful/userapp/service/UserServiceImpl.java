package com.syariful.userapp.service;

import com.syariful.userapp.entity.User;
import com.syariful.userapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        User userSaved = userRepository.save(user);
        return userSaved;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
