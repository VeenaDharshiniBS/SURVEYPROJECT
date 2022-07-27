package com.surveyproject.backend.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;


import com.surveyproject.backend.entities.Survey;
import com.surveyproject.backend.repository.SurveyRepo;


@Service
public class SurveyService {

	@Autowired
	private SurveyRepo surveyDAO;



	public int saveSurvey(Survey survey) {
		survey.getQuestions().forEach(ques -> survey.addQuestion(ques));
		survey.getQuestions().forEach(ques -> {
			if (!ObjectUtils.isEmpty(ques.getOptions())) {
				ques.getOptions().forEach(option -> ques.addOption(option));
			}
		});
		return surveyDAO.save(survey).getId();
	}
}


/*public Optional<Survey> getSurveyById(int surveyId) 
	{
		Optional<Survey> survey = surveyDAO.findById(surveyId);
				return survey;
	}
}*/
