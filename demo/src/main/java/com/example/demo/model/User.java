package com.example.demo.model;

import jakarta.persistence.*; // Importing necessary JPA annotations

@Entity // Indicates that this class is a JPA entity
@Table(name = "users") // Specifies the table name in the database
public class User {
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the ID value
    private Long id;  // Unique identifier for the user

    @Column(unique = true, nullable = false)  // Ensures the username is unique and cannot be null
    private String username;

    @Column(nullable = false) // Ensures the password cannot be null
    private String password;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}