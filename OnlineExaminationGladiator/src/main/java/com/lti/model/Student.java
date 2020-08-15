package com.lti.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private int studentID;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@Column(name = "STUDENT_PWD")
	private String studentPassword;

	@Column(name = "STUDENT_DOB")
	private Date studentDOB;

	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;

	@Column(name = "STUDENT_GENDER")
	private String studentGender;

	@Column(name = "STUDENT_CITY")
	private String studentCity;

	@Column(name = "STUDENT_STATE")
	private String studentState;

	@Column(name = "STUDENT_YOC")
	private int studentYOC;

	@Column(name = "STUDENT_MNO")
	private long studentMobile;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Exam> studentExams;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSudentPassword() {
		return studentPassword;
	}

	public void setSudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public int getStudentYOC() {
		return studentYOC;
	}

	public void setStudentYOC(int studentYOC) {
		this.studentYOC = studentYOC;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public List<Exam> getStudentExams() {
		return studentExams;
	}

	public void setStudentExams(List<Exam> studentExams) {
		this.studentExams = studentExams;
	}
	
	

}
