package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import com.example.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUserByName(String numeCautat) {
        return userRepository.findByName(numeCautat);
    }
}
