import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.StudentController;
import com.lti.model.Student;

public class StudentTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
	StudentController controller = ctx.getBean(StudentController.class);

	@Test
	public void addNewStudentTest() {
		Student stud = new Student();
		stud.setStudentName("Sheldon Cooper");
		stud.setSudentPassword("buzzinga");
		stud.setStudentDOB(LocalDate.of(1988, 02, 15));
		stud.setStudentEmail("cooper.sheldon@gmail.com");
		stud.setStudentGender("Male");
		stud.setStudentCity("Pasadena");
		stud.setStudentState("California");
		stud.setStudentYOC(2018);
		stud.setStudentMobile("1238452");
		
		int i = controller.addNewStudent(stud);
		System.out.println("Student Successfully registered, ID - "+i);
	}

}
