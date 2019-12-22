package assignment_2;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;
import java.util.LinkedList;

public class Testing {

	course testCourse = new course("Engineering", new DateTime(2019, 9, 1, 9, 0), new DateTime(2019, 9, 1, 22, 0));
	student testStudent = new student("John Deere", 12345678, new DateTime(2000,1,1,0,0));
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
	
	
	
}
