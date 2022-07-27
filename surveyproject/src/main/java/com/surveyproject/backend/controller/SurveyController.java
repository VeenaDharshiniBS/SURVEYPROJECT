package com.surveyproject.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surveyproject.backend.entities.Survey;
import com.surveyproject.backend.service.SurveyService;
@RestController
public class SurveyController {
	


		@Autowired
		private SurveyService surveyService;

		@PostMapping("/survey")
		public Integer saveSurvey(@RequestBody Survey survey) {
			return surveyService.saveSurvey(survey);
		}
		
}
