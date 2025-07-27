package com.example.Job_Portal.controller;

import com.example.Job_Portal.model.Job;
import com.example.Job_Portal.model.User;
import com.example.Job_Portal.repository.JobRepository;
import com.example.Job_Portal.repository.UserRepository;
import com.example.Job_Portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private JobService jobService;

    @Autowired
    private UserRepository userRepository;

    // Redirect root URL to /jobs
    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/jobs";
    }

    // Show all jobs
    @GetMapping("/jobs")
    public String listJobs(Model model) {
        List<Job> jobs = jobRepository.findAll();
        model.addAttribute("jobs", jobs);
        return "jobs";
    }

    // Show post job form (for employer)
    @GetMapping("/employer/post-job")
    public String showPostJobForm(Model model) {
        model.addAttribute("job", new Job());
        return "post-job";
    }

    // Handle job post form submission
    @PostMapping("/employer/post-job")
    public String postJob(@ModelAttribute("job") Job job, Principal principal) {
        String email = principal.getName(); // Spring Security gets logged-in user
        User user = userRepository.findByEmail(email).orElse(null);
        job.setUser(user); // Set job owner
        jobService.saveJob(job);
        return "redirect:/jobs";
    }
}
