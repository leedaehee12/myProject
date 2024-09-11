package com.example.myproject.service;

import org.springframework.stereotype.Service;

import com.example.myproject.entity.User;
import com.example.myproject.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
