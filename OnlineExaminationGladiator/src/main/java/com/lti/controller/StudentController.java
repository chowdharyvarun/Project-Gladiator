package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.model.Student;
import com.lti.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	public int addNewStudent(Student student) {
		return service.addNewStudent(student);
	}

	public boolean updateStudent(Student student) {
		return service.updateStudent(student);
	}

	public boolean deleteStudent(int studentId) {
		return service.deleteStudent(studentId);
	}

	public Student findAUser(int userId) {
		return service.findAUser(userId);
	}

	public boolean loginStudent(int userId, String password) {
		return service.loginStudent(userId, password);
	}

}
