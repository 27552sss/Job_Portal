package com.example.Job_Portal;

import com.example.Job_Portal.model.User;
import com.example.Job_Portal.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JobPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobPortalApplication.class, args);
    }

    @Bean
    public CommandLineRunner testUserRepo(UserRepository repo) {
        return args -> {
            if (repo.findByUsername("employer1").isEmpty()) {
                User user = new User("employer1", "emp1@test.com", "pass123", User.Role.EMPLOYER);
                repo.save(user);
                System.out.println("User saved!");
            }

            repo.findByUsername("employer1").ifPresent(System.out::println);
        };
    }
}
