package com.lti.service;

import java.util.List;

import com.lti.model.Exam;
import com.lti.model.Question;

public interface ExamService {
	
	int addNewExam(Exam exam);
	List<Exam> listAllExams();
	List<Exam> listExamsOfASubject(int subjectId);
	Exam findExamById(int examId);
	List<Exam> listAllExamsOfAStudent(int studentId);

}
