package com.surveyproject.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surveyproject.backend.entities.Question;
@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
