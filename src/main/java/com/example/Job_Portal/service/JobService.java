package com.example.Job_Portal.service;

import com.example.Job_Portal.model.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {
    List<Job> getAllJobs();
    Optional<Job> getJobById(Long id);
    void saveJob(Job job);
    void deleteJob(Long id);
}
