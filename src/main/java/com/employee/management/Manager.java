package com.employee.management;

class Manager extends Employee{
	int teamSize;
	public Manager(int id,String name,int age,String dpmt,double salary,int teamSize)
			throws InvalidAgeException {
		super( id,name,age,dpmt,salary);
		
		this.teamSize=teamSize;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Team Size: "+teamSize);
	}
	@Override
	public void work() {
		System.out.println("Managing----");
	}
	
}
