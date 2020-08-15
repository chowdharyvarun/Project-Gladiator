package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Result {
	
	@Id
	@GeneratedValue
	@Column(name="USER_RESULT_ID")
	private int userResultId;
	
	@Column(name="RESULT_STATUS")
	private String resultStatus;
	
	@Column(name="SCORE")
	private int score;
	
	@Column(name="LEVEL_PASSED")
	private int levelPassed;
	
	@OneToOne
	@JoinColumn(name="TEST_ID") 
	private Exam examDetail;

}
