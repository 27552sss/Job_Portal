package com.example.Job_Portal.controller;

import com.example.Job_Portal.model.Job;
import com.example.Job_Portal.model.User;
import com.example.Job_Portal.repository.JobRepository;
import com.example.Job_Portal.service.ApplicationService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private JobRepository jobRepository;

    @GetMapping("/apply/{jobId}")
    public String showApplyForm(@PathVariable Long jobId, Model model) {
        Job job = jobRepository.findById(jobId).orElse(null);
        if (job == null) {
            return "redirect:/jobs";
        }
        model.addAttribute("job", job);
        return "apply";
    }

    @PostMapping("/apply/{jobId}")
    public String applyToJob(@PathVariable Long jobId,
                             @RequestParam String resumeLink,
                             HttpSession session) {

        // Assuming logged-in user is stored in session
        User user = (User) session.getAttribute("user");

        Job job = jobRepository.findById(jobId).orElse(null);
        if (user == null || job == null) {
            return "redirect:/login";
        }

        applicationService.applyToJob(user, job, resumeLink);
        return "redirect:/jobs";
    }
}
