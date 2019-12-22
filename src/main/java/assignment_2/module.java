package assignment_2;

import java.util.LinkedList;

public class module {

	private String name;
	private String ID;
	
	private LinkedList<student> students;
	private LinkedList<course> linked_courses;
	
	public module(String name, String ID) 
	{
		this.name = name;
		this.ID = ID;
		
		students = new LinkedList<student>();
		linked_courses = new LinkedList<course>();
	}
	
	// Accessor Methods
	
	public String get_name() 
	{
		return name;
	}
	
	public String get_ID() 
	{
		return ID;
	}
	
	public LinkedList<student> get_students() 
	{
		return students;
	}
	
	public LinkedList<course> get_linked_courses() 
	{
		return linked_courses;
	}
	
	// Mutator Methods
	
	public void set_name(String name)
	{
		this.name = name;
	}
	
	public void set_ID(String ID) 
	{
		this.ID = ID;
	}
	
	public void add_student(student student) 
	{
		students.add(student);
	}
	
	public void add_linked_courses(course course) 
	{
		linked_courses.add(course);
	}
	
	public void remove_student(student student) 
	{
		students.remove(student);
	}
	
	public void remove_linked_course(course course) 
	{
		linked_courses.remove(course);
	}
}

