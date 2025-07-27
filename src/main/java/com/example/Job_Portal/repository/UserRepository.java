// File: src/main/java/com/example/Job_Portal/repository/UserRepository.java

package com.example.Job_Portal.repository;

import com.example.Job_Portal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
