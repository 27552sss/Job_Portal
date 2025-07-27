package com.example.Job_Portal.repository;

import com.example.Job_Portal.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // You can add custom queries here, e.g.:
    // List<Job> findByStatus(Job.Status status);
}
