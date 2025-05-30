package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User register(UserDTO userDTO) {
        if (userRepository.findByUsername(userDTO.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists");
        }
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword()); // Store plain text password (not recommended for production)
        return userRepository.save(user);
    }

    public boolean login(UserDTO userDTO) {
        return userRepository.findByUsername(userDTO.getUsername())
                .map(user -> userDTO.getPassword().equals(user.getPassword()))
                .orElse(false);
    }
}