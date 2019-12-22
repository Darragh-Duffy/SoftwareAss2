package assignment_2;

import java.util.LinkedList;

import org.joda.time.DateTime;

public class course {
	
	private String name;
	private DateTime start_date;
	private DateTime end_date;
	
	private LinkedList<module> modules;
	private LinkedList<student> students;
	
	public course(String name, DateTime start_date, DateTime end_date) 
	{
		this.name = name;
		this.start_date = start_date;
		this.end_date = end_date;
		
		modules = new LinkedList<module>();
		students = new LinkedList<student>();
	}
	
	// Accessor methods
	
	public String get_name() 
	{
		return name;
	}
	
	public DateTime get_start_date() 
	{
		return start_date;
	}
	
	public DateTime get_end_date() 
	{
		return end_date;
	}
	
	public LinkedList<module> get_modules()
	{
		return modules;
	}
	
	public LinkedList<student> get_students()
	{
		return students;
	}
	
	// Mutator methods
	
	public void set_name(String name) 
	{
		this.name = name;
	}
	
	public void set_start_date(DateTime start_date)
	{
		this.start_date = start_date;
	}
	
	public void set_end_date(DateTime end_date) 
	{
		this.end_date = end_date;
	}
	
	public void add_student(student student) 
	{
		students.add(student);
	}
	
	public void remove_student(student student) 
	{
		students.remove(student);
	}
	
	public void add_module(module module) 
	{
		modules.add(module);
	}
	
	public void remove_module(module module) 
	{
		modules.remove(module);
	}
	
}
