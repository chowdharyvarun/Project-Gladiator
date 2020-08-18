import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.SubjectController;
import com.lti.model.Subject;

public class SubjectTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
	SubjectController controller = ctx.getBean(SubjectController.class);

	@Test
	public void addNewSubjectTest() {
		Subject sub = new Subject();
		sub.setSubjectName("JAVA");
		System.out.println(controller.addNewSubject(sub));
		
	}

}
