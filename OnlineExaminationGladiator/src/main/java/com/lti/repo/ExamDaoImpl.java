package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Exam;
import com.lti.model.Student;
import com.lti.model.Subject;

@Repository
public class ExamDaoImpl implements ExamDao {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public int addNewExam(Exam exam) {
		Exam e = em.merge(exam);
		return e.getExamId();

	}

	public List<Exam> listAllExams() {
		String sql = "select ex from Exam ex";
		TypedQuery<Exam> qry = em.createQuery(sql, Exam.class);
		List<Exam> exams = qry.getResultList();
		return exams;
	}

	public List<Exam> listExamsOfASubject(int subjectId) {
		String sql = "select ex from Exam ex where ex.examSubject = :sub";
		TypedQuery<Exam> qry = em.createQuery(sql, Exam.class);
		qry.setParameter("sub", subjectId);
		List<Exam> exams = qry.getResultList();
		return exams;
	}

	@Transactional
	public Exam findExamById(int examId) {
		return em.find(Exam.class, examId);
	}

	public List<Exam> listAllExamsOfAStudent(int studentId) {
		String sql = "select ex from Exam ex where ex.student = :stu";
		TypedQuery<Exam> qry = em.createQuery(sql, Exam.class);
		qry.setParameter("stu", studentId);
		List<Exam> exams = qry.getResultList();
		return exams;
	}

}
