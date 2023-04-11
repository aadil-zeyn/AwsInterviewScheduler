package com.UST.InterviewScheduler.service;

import com.UST.InterviewScheduler.model.InterviewModel;
import com.UST.InterviewScheduler.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InterviewService {
    @Autowired
    private InterviewRepository repo;
    public InterviewModel createInterview(InterviewModel interviewModel) {
        return repo.save(interviewModel);
    }

    public List<InterviewModel> getInterviews() {
        return repo.findAll();
    }


    public InterviewModel getInterviewByEmail(String email) {
        return repo.findByEmail(email);
    }
}
