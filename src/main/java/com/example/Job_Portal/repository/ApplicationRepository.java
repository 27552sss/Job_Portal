package com.example.Job_Portal.repository;

import com.example.Job_Portal.model.Application;
import com.example.Job_Portal.model.Job;
import com.example.Job_Portal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByApplicant(User user); // ✅ must match 'applicant' field
    List<Application> findByJob(Job job);
}
