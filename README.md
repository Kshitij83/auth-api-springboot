# 🧑‍💻 User Registration & Login API - Spring Boot

This is a simple RESTful API built using **Spring Boot**, **Spring Security**, and **Spring Data JPA**. It allows users to register and log in securely. Passwords are encrypted, and all database interactions are handled via JPA. This project uses **MySQL** as the database.

## Lifecycle Workflow

1. **User Registration**
    - The client sends a POST request to `/api/auth/register` with a JSON body containing `username` and `password`.
    - [`AuthController`](src/main/java/com/example/demo/controller/AuthController.java) receives the request and calls the `register` method of [`UserService`](src/main/java/com/example/demo/service/UserService.java).
    - `UserService` checks if the username already exists using [`UserRepository`](src/main/java/com/example/demo/repository/UserRepository.java).
    - If the username is unique, a new [`User`](src/main/java/com/example/demo/model/User.java) entity is created and saved to the database.
    - The controller returns a success or error message.

2. **User Login**
    - The client sends a POST request to `/api/auth/login` with a JSON body containing `username` and `password`.
    - [`AuthController`](src/main/java/com/example/demo/controller/AuthController.java) receives the request and calls the `login` method of [`UserService`](src/main/java/com/example/demo/service/UserService.java).
    - `UserService` fetches the user by username and compares the password.
    - If the credentials match, a success response is returned; otherwise, an error message is sent.

## Main Components

- **Model:** [`User`](src/main/java/com/example/demo/model/User.java)
- **DTO:** [`UserDTO`](src/main/java/com/example/demo/dto/UserDTO.java)
- **Repository:** [`UserRepository`](src/main/java/com/example/demo/repository/UserRepository.java)
- **Service:** [`UserService`](src/main/java/com/example/demo/service/UserService.java)
- **Controller:** [`AuthController`](src/main/java/com/example/demo/controller/AuthController.java)

---

For more details, see the source files in the `src/main/java/com/example/demo` directory.



