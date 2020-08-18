import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.ExamController;
import com.lti.controller.StudentController;
import com.lti.controller.SubjectController;
import com.lti.model.Exam;
import com.lti.model.Student;
import com.lti.model.Subject;

public class ExamTest {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
	ExamController controller = ctx.getBean(ExamController.class);
	SubjectController subControl = ctx.getBean(SubjectController.class);
	StudentController stuControl = ctx.getBean(StudentController.class);

	@Test
	public void addNewExamTest() {
		List<Exam> examList = new ArrayList<Exam>();
		Exam exam = new Exam();
		exam.setExamName("sql01");
		Subject sub = subControl.getSubjectBYSubjectId(22);
		exam.setTestSubject(sub);
		Student stu = stuControl.findAUser(20203);
		exam.setStudent(stu);
		examList.add(exam);	
		sub.setSubjectExams(examList);
		stu.setStudentExams(examList);
		System.out.println(controller.addNewExam(exam));
	}
	
	@Test
	public void listExamsOfASubjectTest() {
		Subject sub = subControl.getSubjectBYSubjectId(22);
		System.out.println(controller.listExamsOfASubject(sub));
	}
	
	@Test
	public void listAllExamsOfAStudentTest() {
		Student stu = stuControl.findAUser(20203);
		System.out.println(controller.listAllExamsOfAStudent(stu));
	}

}
