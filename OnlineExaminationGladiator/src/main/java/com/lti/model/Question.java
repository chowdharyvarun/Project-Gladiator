package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	@Column(name="QUESTION_ID")
	private int questionId;
	
	@Column(name="QUESTION")
	private String question;
	
	@Column(name="OPTION1")
	private String choiceOne;
	
	@Column(name="OPTION2")
	private String choiceTwo;
	
	@Column(name="OPTION3")
	private String choiceThree;
	
	@Column(name="OPTION4")
	private String choiceFour;
	
	@Column(name="CORRECT_ANS")
	private String correctAns;
	
	@Column(name="QUESTION_STATUS")
	private int questionStatus;
	
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private Subject examSubject;
	

	@OneToMany(mappedBy="question" ,cascade=CascadeType.ALL)
	private List<Response> responseList;

}
