package com.UST.InterviewScheduler.repository;

import com.UST.InterviewScheduler.model.InterviewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepository extends JpaRepository<InterviewModel,Integer> {

    InterviewModel findByEmail(String email);
}
