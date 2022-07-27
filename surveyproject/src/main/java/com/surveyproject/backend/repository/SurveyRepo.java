package com.surveyproject.backend.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surveyproject.backend.entities.Survey;

@Repository
public interface SurveyRepo extends JpaRepository<Survey, Integer> {


}
