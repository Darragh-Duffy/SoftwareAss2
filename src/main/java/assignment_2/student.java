package assignment_2;

import java.util.LinkedList;
import org.joda.time.DateTime;
import org.joda.time.Years;

public class student {

	private String name;
	private int ID;
	private Years age;
	private DateTime dob;
	private DateTime current = new DateTime(2019, 12, 22, 9, 0, 0);
	
	private String username;
	
	private LinkedList<course> courses;
	private LinkedList<module> modules;
	
	public student(String name, int ID, DateTime dob) 
	{
		this.name = name;
		this.ID = ID;
		this.dob = dob;
		
		age =  Years.yearsBetween(current, dob);
		username = name + age.toString();
		
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

	public Years get_age() 
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
		age =  Years.yearsBetween(current, dob);
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

