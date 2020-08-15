package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@PersistenceContext
	EntityManager em;

	@Transactional
	public int addNewStudent(Student student) {
		Student s = em.merge(student);
		return student.getStudentID();
	}

	@Transactional
	public boolean updateStudent(Student student) {
		if (em.find(Student.class, student.getStudentCity()) != null) {
			em.merge(student);
			return true;
		}
		return false;
	}

	@Transactional
	public boolean deleteStudent(int studentId) {
		Student student = em.find(Student.class, studentId);
		if (student != null) {
			em.remove(student);
			return true;
		}
		return false;
	}

	public Student findAUser(int studentId) {
		return em.find(Student.class , studentId);
	}

	public boolean loginStudent(int userId, String password) {
		String sql = "select stud from Student stud where stud.studentId = :sid and stud.studentPassword = :sp";
		TypedQuery<Student> qry = em.createQuery(sql, Student.class);
		qry.setParameter("uid", userId);
		qry.setParameter("up", password);
		List<Student> students = qry.getResultList();
		if (students.isEmpty())
			return false;

		return true;
		
	}

}
