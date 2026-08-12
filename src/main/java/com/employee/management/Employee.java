package com.employee.management;

abstract class Employee{
	private int id;
	private String name;
	private int age;
	private String department;
	private double salary;
	 

	public Employee(int id,String name,int age,String dpmt,double salary)
			throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Age is not eligible");
		}
		if(id <=0 || salary<=0||age<=0) {
			throw new IllegalArgumentException("Input is invalid please Do not enter id,salary or age as 0");
		}
		else {
		this.id=id;
		this.name=name;
		this.age=age;
		this.department=dpmt;
		this.salary=salary;
		}
	}

	public int getId() {
		return id;
	}
	public void setId(int id) throws IllegalArgumentException{
		if(id <=0) {
			throw new IllegalArgumentException("Input is invalid");
		}else {
		this.id=id;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws IllegalArgumentException {
		if(age<=0) {
			throw new IllegalArgumentException("Input is invalid");
		}
		else {
			
		this.age=age;
		}
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary)throws IllegalArgumentException {
		if(salary<=0) {
			throw new IllegalArgumentException("Input is invalid");
		}
		else {
		this.salary=salary;
		}
	}
    public void display() {
    	System.out.println("----Employee Detail----");
    	System.out.println("Emp Id: "+getId());
    	System.out.println("Emp Name: "+getName());
    	System.out.println("Emp Age: "+getAge());
    	System.out.println("Emp Department: "+getDepartment());
    	System.out.println("Emp Salary: "+getSalary());	
    }
    public abstract void work();
    @Override
	public String toString() {
		return id+"  "+name+"  "+salary+"  "+department;
	}
}