package com.example.Job_Portal.service;

import com.example.Job_Portal.model.Application;
import com.example.Job_Portal.model.Job;
import com.example.Job_Portal.model.User;
import com.example.Job_Portal.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Application applyToJob(User user, Job job, String resumeLink) {
        Application application = new Application();
        application.setApplicant(user); 
        application.setJob(job);
        application.setResumeLink(resumeLink);
        return applicationRepository.save(application);
    }

    @Override
    public List<Application> getApplicationsByUser(User user) {
        return applicationRepository.findByApplicant(user); 
    }

    @Override
    public List<Application> getApplicationsByJob(Job job) {
        return applicationRepository.findByJob(job); 
    }
}
