package com.surveyproject.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.surveyproject.enums.QuestionType;
import com.surveyproject.repository.OptionRepo;
import com.surveyproject.repository.QuestionRepo;
import com.surveyproject.repository.SurveyRepo;
import com.surveyproject.entities.Options;
import com.surveyproject.entities.Question;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepo questionDAO;
	@Autowired
	private OptionRepo optionDAO;
	
	public int addQuestion(Question question)
	{
		if(question.getType()==QuestionType.SINGLECHOICE)
		{
			question.setOptions(setChoiceQuestion());
			return HttpStatus.OK.value();
		}
		else if(question.getType()==QuestionType.MULTIPLE)
		{
			question.setOptions(setChoiceQuestion());
			return HttpStatus.OK.value();
		}
		questionDAO.save(question);
		return HttpStatus.BAD_REQUEST.value(); 
	}
	
	public List<Options> setChoiceQuestion()
	{
		List<Options> SingleChoiceOptions = new ArrayList<Options>();
		for(int i=1;i<=4;i++)
		{
			Options option = new Options();
			option.getId();
			option.getLabel();
			if(addOption(option)!=400)
			{
				SingleChoiceOptions.add(option);
			}
		}
		return SingleChoiceOptions;
	}
	
	public int addOption(Options option) {
        if (optionDAO.existsById(option.getId()))
            return HttpStatus.FOUND.value();
        optionDAO.save(option);
        if (optionDAO.existsById(option.getId()))
            return HttpStatus.ACCEPTED.value();
        return HttpStatus.BAD_REQUEST.value();
    }

	
}
