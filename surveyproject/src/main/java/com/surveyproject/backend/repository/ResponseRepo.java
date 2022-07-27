package com.surveyproject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surveyproject.backend.entities.Response;

@Repository
public interface ResponseRepo extends JpaRepository<Response, Integer>{
	

}
