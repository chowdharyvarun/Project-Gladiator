package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue
	@Column(name="SUBJECT_ID")
	private int subjectId;
	
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	
	@OneToMany(mappedBy="testSubject" ,cascade=CascadeType.ALL)
	private List<Exam> subjectExams;
	
	@OneToMany(mappedBy="examSubject" ,cascade=CascadeType.ALL)
	private List<Question> subjectQuestions;

}
