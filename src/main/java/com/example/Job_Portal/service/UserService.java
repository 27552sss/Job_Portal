package com.example.Job_Portal.service;

import com.example.Job_Portal.model.User;
import java.util.Optional;

/**
 * Service interface for User-related operations.
 */
public interface UserService {
    /**
     * Register a new user (with password encoding).
     * @param user the user to register
     */
    void register(User user);

    /**
     * Find a user by email.
     * @param email the user email
     * @return Optional user
     */
    Optional<User> findByEmail(String email);
}