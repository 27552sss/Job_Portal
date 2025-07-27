package com.example.Job_Portal.service;

import com.example.Job_Portal.model.Application;
import com.example.Job_Portal.model.Job;
import com.example.Job_Portal.model.User;

import java.util.List;

public interface ApplicationService {
    Application applyToJob(User user, Job job, String resumeLink);
    List<Application> getApplicationsByUser(User user);
    List<Application> getApplicationsByJob(Job job);
}
