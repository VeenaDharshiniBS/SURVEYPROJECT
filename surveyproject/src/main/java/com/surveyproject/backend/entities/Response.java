package com.surveyproject.backend.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Response {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String respondentemail;
	private String answers;
	@ManyToMany
	@JoinTable(name = "response_x_option", joinColumns = @JoinColumn(name = "response_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "option_id", referencedColumnName = "id"))
	private List<Options> options;
	@ManyToOne
	private Question question;

	public Integer getId() {
		return id;
	}

	
	public String getRespondentemail() {
		return respondentemail;
	}

	public void setRespondentemail(String respondentemail) {
		this.respondentemail = respondentemail;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public List<Options> getOptions() {
		return options;
	}

	public void setOptions(List<Options> options) {
		this.options = options;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
