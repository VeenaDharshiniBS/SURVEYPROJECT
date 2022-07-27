package com.surveyproject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surveyproject.backend.entities.Options;

@Repository
public interface OptionRepo extends JpaRepository<Options, Integer>{

}
