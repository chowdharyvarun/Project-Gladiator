package com.lti.service;

import com.lti.model.Student;

public interface StudentService {
	int addNewStudent(Student student);
	boolean updateStudent(Student student);
	boolean deleteStudent(int studentId);
	Student findAUser(int userId);
	boolean loginStudent(int userId , String password);

}
