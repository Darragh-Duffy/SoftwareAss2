package assignment_2;

import java.util.LinkedList;
import org.joda.time.DateTime;

public class student {

	private String name;
	private int ID;
	private int age;
	private DateTime dob;
	private String username;
	
	private LinkedList<course> courses;
	private LinkedList<module> modules;
	
	public student(String name, int ID, DateTime dob) 
	{
		this.name = name;
		this.dob = dob;
		
		//age = date.now - dob (something like this)
		username = name + dob;
		
		courses = new LinkedList<course>();
		modules = new LinkedList<module>();
	}
	
	
	// Accessor Methods
	public String get_name() 
	{
		return name;
	}
	
	public int get_ID() 
	{
		return ID;
	}

	public int get_age() 
	{
		return age;
	}
	
	public DateTime get_dob() 
	{
		return dob;
	}
	
	public String get_username() 
	{
		return username;
	}
	
	public LinkedList<course> get_courses() 
	{
		return courses;
	}
	
	public LinkedList<module> get_modules() 
	{
		return modules;
	}
	
	// Mutator Methods
	
	public void set_name(String name) 
	{
		this.name = name;
	}
	
	public void set_ID(int ID) 
	{
		this.ID = ID;
	}
	
	public void set_dob(DateTime dob) 
	{
		this.dob = dob;
		//age = date.now - dob (something like this)
	}
	
	public void add_course(course course) 
	{
		courses.add(course);
	}
	
	public void add_module(module module) 
	{
		modules.add(module);
	}
	
	public void remove_course(course course) 
	{
		courses.remove(course);
	}
	
	public void remove_module(module module) 
	{
		modules.remove(module);
	}
}

