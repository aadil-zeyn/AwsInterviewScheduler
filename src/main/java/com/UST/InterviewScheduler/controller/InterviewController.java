package com.UST.InterviewScheduler.controller;

import com.UST.InterviewScheduler.model.InterviewModel;
import com.UST.InterviewScheduler.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class InterviewController {
    @Autowired
    private InterviewService interviewService;
    @PostMapping("/add")
    public InterviewModel addInterview(@RequestBody InterviewModel interviewModel){
        return interviewService.createInterview(interviewModel);
    }
    @GetMapping("/all")
    public List<InterviewModel> getAllInterviews(){
        return interviewService.getInterviews();
    }
    @GetMapping("/user/{email}")
    public InterviewModel getInterviewer(@PathVariable String email){
        return interviewService.getInterviewByEmail(email);
    }

}
