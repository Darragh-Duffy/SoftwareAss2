package assignment_2;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.junit.Test;
import java.util.LinkedList;

public class Testing {

	course testCourse = new course("Engineering", new DateTime(2019, 9, 1, 9, 0), new DateTime(2019, 9, 1, 22, 0));
	student testStudent = new student("JohnDeere", 12345678, new DateTime(2000,1,1,0,0));
	module testModule = new module("Software", "CT417");

	@Test
	public void courseName() {
		
		String result = testCourse.get_name();
				
		assertEquals(result, "Engineering");
	}
	
	@Test
	public void courseStartDate() {
		
		DateTime result = testCourse.get_start_date();
				
		assertEquals(result, new DateTime(2019, 9, 1, 9, 0));
	}
	
	@Test
	public void courseEndDate() {
		
		DateTime result = testCourse.get_end_date();
				
		assertEquals(result, new DateTime(2019, 9, 1, 22, 0));
	}
	
	@Test
	public void changeCourseName() {
		
		testCourse.set_name("Machine Learning");
		
		String result = testCourse.get_name();
				
		assertEquals(result, "Machine Learning");
	}
	
	@Test
	public void changeCourseStartDate() {
		
		testCourse.set_start_date(new DateTime(2019, 9, 1, 9, 0));
		
		DateTime result = testCourse.get_start_date();
				
		assertEquals(result, new DateTime(2019, 9, 1, 9, 0));
	}

	@Test
	public void changeCourseEndDate() {
		
		testCourse.set_end_date(new DateTime(2019, 9, 1, 23, 0));
		
		DateTime result = testCourse.get_end_date();
				
		assertEquals(result, new DateTime(2019, 9, 1, 23, 0));
	}
	
	@Test
	public void addStudent() {
		
		testCourse.add_student(testStudent);	
		
		LinkedList<student>comparable = new LinkedList<student>();
		comparable.add(testStudent);
		
		LinkedList<student>result = testCourse.get_students();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void removeStudent() {
		
		testCourse.remove_student(testStudent);	
		
		LinkedList<student>comparable = new LinkedList<student>();
		
		LinkedList<student>result = testCourse.get_students();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void addModule() {
		
		testCourse.add_module(testModule);	
		
		LinkedList<module>comparable = new LinkedList<module>();
		comparable.add(testModule);
		
		LinkedList<module>result = testCourse.get_modules();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void removeModule() {
		
		testCourse.remove_module(testModule);	
		
		LinkedList<module>comparable = new LinkedList<module>();

		LinkedList<module>result = testCourse.get_modules();
		
		assertEquals(result, comparable);
	}
	
	
	@Test
	public void moduleName() {
		
		String result = testModule.get_name();
				
		assertEquals(result, "Software");
	}
	
	@Test
	public void moduleID() {
		
		String result = testModule.get_ID();
				
		assertEquals(result, "CT417");
	}
	
	@Test
	public void changeModuleName() {
		
		testModule.set_name("Machine Learning");
		
		String result = testModule.get_name();
				
		assertEquals(result, "Machine Learning");
	}
	
	@Test
	public void changeModuleID() {
		
		testModule.set_ID("CT418");
		
		String result = testModule.get_ID();
				
		assertEquals(result, "CT418");
	}
	
	@Test
	public void addStudenttoModule() {
		
		testModule.add_student(testStudent);	
		
		LinkedList<student>comparable = new LinkedList<student>();
		comparable.add(testStudent);
		
		LinkedList<student>result = testModule.get_students();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void removeStudentfromModule() {
		
		testModule.remove_student(testStudent);	
		
		LinkedList<student>comparable = new LinkedList<student>();
		
		LinkedList<student>result = testModule.get_students();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void addCoursetoModule() {
		
		testModule.add_linked_course(testCourse);	
		
		LinkedList<course>comparable = new LinkedList<course>();
		comparable.add(testCourse);
		
		LinkedList<course>result = testModule.get_linked_courses();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void removeCoursefromModule() {
		
		testModule.remove_linked_course(testCourse);	
		
		LinkedList<course>comparable = new LinkedList<course>();

		LinkedList<course>result = testModule.get_linked_courses();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void studentName() {
		
		String result = testStudent.get_name();
				
		assertEquals(result, "JohnDeere");
	}
	
	@Test
	public void studentID() {
		
		int result = testStudent.get_ID();
				
		assertEquals(result, 12345678);
	}
	

	
	@Test
	public void studentDOB() {
		
		DateTime testDOB =  new DateTime(2000,1,1,0,0);
		
		DateTime result = testStudent.get_dob();
				
		assertEquals(result, testDOB);
	}
	
	@Test
	public void studentUsername() {
		String result = testStudent.get_name();
		
		assertEquals(result, "JohnDeere");
	}
	
	@Test
	public void getStudentCourses() {
		
		
		LinkedList<course>comparable = new LinkedList<course>();

		LinkedList<course>result = testStudent.get_courses();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void getStudentModules() {
		
		
		LinkedList<module>comparable = new LinkedList<module>();

		LinkedList<module>result = testStudent.get_modules();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void setStudentName() {
		
		testStudent.set_name("JohnDoe");
		
		String result = testStudent.get_name();
				
		assertEquals(result, "JohnDoe");
	}
	
	@Test
	public void setStudentDOB() {
		
		testStudent.set_dob(new DateTime(2000,1,1,1,0));
		
		DateTime testDOB =  new DateTime(2000,1,1,1,0);
		
		DateTime result = testStudent.get_dob();
				
		assertEquals(result, testDOB);
	}
	
	@Test
	public void addStudentCourses() {
		
		testStudent.add_course(testCourse);
		LinkedList<course>comparable = new LinkedList<course>();
		comparable.add(testCourse);

		LinkedList<course>result = testStudent.get_courses();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void addStudentModule() {
		
		testStudent.add_module(testModule);
		LinkedList<module>comparable = new LinkedList<module>();
		comparable.add(testModule);

		LinkedList<module>result = testStudent.get_modules();
		
		assertEquals(result, comparable);
	}
	
	@Test
	public void removeStudentCourses() {
		
		testStudent.remove_course(testCourse);
		
		LinkedList<course>comparable = new LinkedList<course>();

		LinkedList<course>result = testStudent.get_courses();
		
		assertEquals(result, comparable);
	}
	
	public void removeStudentModule() {
		
		testStudent.remove_module(testModule);
		
		LinkedList<module>comparable = new LinkedList<module>();

		LinkedList<module>result = testStudent.get_modules();
		
		assertEquals(result, comparable);
	}
	
	
	
}
