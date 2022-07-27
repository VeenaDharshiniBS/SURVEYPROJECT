/*package com.surveyproject.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surveyproject.backend.enums.QuestionType;
import com.surveyproject.backend.repository.QuestionRepo;
import com.surveyproject.backend.repository.SurveyRepo;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepo questionDAO;
	
	public void addOptions(QuestionType questionType)
	{
		if(questionType  "SINGLECHOICE")
		{
		  questionDAO.getOptions();
		}
	}
}
	/*public addOption()
	{
		
	}

}*/
