package com.jayesh.employeemanagement.model;
import com.jayesh.employeemanagement.exception.InvalidAgeException;
public class Developer extends Employee{
	private String programmingLanguage;
	public Developer(int id,String name,int age,String dpmt,double salary,String programmL)
			throws InvalidAgeException    {
		   super( id,name,age,dpmt,salary);
			
		    this.programmingLanguage=programmL;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Programming Language: "+programmingLanguage);
	}
	@Override
	public void work() {
		System.out.println("Coding----");
	}
}
