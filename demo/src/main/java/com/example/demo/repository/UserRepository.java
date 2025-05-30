package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository; // Importing necessary Spring Data JPA annotations
import java.util.Optional;  // Importing Optional for handling null values gracefully

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // Method to find a user by their username
}