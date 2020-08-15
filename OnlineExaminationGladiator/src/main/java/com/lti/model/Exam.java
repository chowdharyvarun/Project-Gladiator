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
import javax.persistence.OneToOne;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue
	@Column(name="EXAM_ID")
	private int examId;
	
	@Column(name = "EXAM_NAME")
	private String examName;
	
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private Subject testSubject;
	
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	private Student student;
	
	@OneToMany(mappedBy="examDetails" ,cascade=CascadeType.ALL)
	private List<Response> responses;
	
	@OneToOne(mappedBy="examDetail",cascade = CascadeType.ALL)
	private Result testResult;

}
