package com.employee.management;

import java.util.LinkedList;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
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
}
class Developer extends Employee{
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

public class EmployeeManagementSystem {

	public static boolean isExists(LinkedList<Employee> employeList,int id) {


		for(Employee e : employeList){
		    if(e.getId() == id){
		        return true;

		    }
		}
		return false;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Employee> employeList=new LinkedList<>();	
		Employee emp;
		int choice;
		
		do {
			System.out.println("-----Employee Management System-----");
			System.out.println("1.Add Employee:");
			System.out.println("2.Display All Employee:");
			System.out.println("3.Search Employee By Id:");
			System.out.println("4.Update Employee:");
			System.out.println("5.Delete Employee:");
			System.out.println("6.Total Employees");
			System.out.println("7.Exite");
			System.out.println("-----------------------------------");
			System.out.print("Enter Your Choise:");
			 choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter Number Of Employee: ");
				int numberOfEmployee=sc.nextInt();
				for(int i=0;i< numberOfEmployee;i++) {
					sc.nextLine();
					
					System.out.print("Select Developer or Manager:");
					String selectedEmp=sc.nextLine();
					
					System.out.print("Enter Emp id= ");
					int id=sc.nextInt();
					
					System.out.print("Enter Emp Name= ");
					String name=sc.next().toUpperCase();
					
					System.out.print("Enter Emp Age= ");
					int age=sc.nextInt();
					
					System.out.print("Enter Emp Deparment= ");
					String dpment=sc.next();
					
					System.out.print("Enter Emp Salary= ");
					double salary=sc.nextDouble();
					
					try {
						if(selectedEmp.equalsIgnoreCase("Developer") ){
							System.out.print("Enter Programm Language= ");
							String programLanguage=sc.next();
					        
							if(isExists(employeList,id)){
							    System.out.println("Employee ID already exists.");
							}
							else{
								emp=new Developer(id,name,age,dpment,salary,programLanguage);
							     employeList.add(emp);
							}
					     
						}
						else if(selectedEmp.equalsIgnoreCase("Manager")){
							System.out.print("Enter Team Size= ");
							int size=sc.nextInt();
							
							if(isExists(employeList, id)){
							    System.out.println("Employee ID already exists.");
							}
							else{
								emp=new Manager(id,name,age,dpment,salary,size);
							     employeList.add(emp);
							}
						}
						else {
							System.out.println("invalid user selected by you");
						}
					}
					catch (InvalidAgeException e) {
						System.out.println(e.getMessage());
						
					}	
					catch(IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;
			case 2:
				for(Employee emp1 : employeList){
				    emp1.display();
				    emp1.work();
				    System.out.println();
				}
			break;
			case 3:
			    System.out.print("Enter ID to Search: ");
			    int sId = sc.nextInt();

			    boolean isFound = false;

			    for (int i = 0; i < employeList.size(); i++) {
			        emp = employeList.get(i);
			       
			        if (emp.getId() == sId) {
			        	
			            emp.display();
			            emp.work();      // Optional
			            isFound = true;
			            break;
			        }
			    }

			    if (!isFound) {
			        System.out.println("Employee Not Found.");
			    }

			    break;
			case 4:
				System.out.println("Enter Id Of employee for update:");
				int uId=sc.nextInt();
				boolean isEmpFound=false;
				for(int j=0;j<employeList.size();j++) {
					emp=employeList.get(j);
					if(emp!=null&&uId==emp.getId()) {
						isEmpFound = true;
						System.out.println("Enter What Update You Want:");
						System.out.println("1.Id");
						System.out.println("2.Name");
						System.out.println("3.Salary");
						System.out.println("4.Age");
						
						System.out.print("Select Option For Update: ");
						int update=sc.nextInt();
						sc.nextLine();
						switch(update) {
						case 1:
							System.out.print("Enter New Id: ");
							int newId=sc.nextInt();
							try {
								if(newId != emp.getId() && isExists(employeList, newId)) {
							       System.out.println("Employee Id Is Alredy Exists");
								}
								else {
									 emp.setId(newId);
								}
							break;
							}
							catch(IllegalArgumentException e) {
								System.out.println(e.getMessage());
							}
							catch(Exception e) {
								System.out.println(e.getMessage());
							}
						
						break;
						case 2:
						System.out.print("Enter New Name:");
						String newName=sc.nextLine();
						
						emp.setName(newName);
						isEmpFound = true;
						break;
						
						case 3:
							System.out.print("Enter New Salary:");
							double newSalary=sc.nextDouble();
							try {
							emp.setSalary(newSalary);
							isEmpFound = true;
							break;
							}
							catch(IllegalArgumentException e) {
								System.out.println(e.getMessage());
							}
							catch(Exception e) {
								System.out.println(e.getMessage());
							}
							break;
						case 4:
							
							System.out.print("Enter New Age:");
							int newAge=sc.nextInt();
							try {
							emp.setAge(newAge);
							isEmpFound = true;
							break;
							
							}
							
							catch(IllegalArgumentException e) {
								System.out.println(e.getMessage());
								break;
							}
							catch(Exception e) {
								System.out.println(e.getMessage());
								break;
							}
							default:
								System.out.println("Please Select Correct Option");
					}
				}
				if(!isEmpFound) {
					System.out.println("Id is not found !Please Enter Valid Id");
				}
				}
				break;
				
			case 5:
				System.out.println("Enter Id for Delete Emp:");
				int dId=sc.nextInt();
				boolean isdIDFound=false;
				for(int i=0;i<employeList.size();i++) {
					emp=employeList.get(i);
					if(emp !=null &&dId==emp.getId()) {
						employeList.remove(i);
						isdIDFound=true;
						break;
					}
				}
				if(!isdIDFound) {
					System.out.println("Id Not found");
				}
				break;
			case 6:
				if(employeList.isEmpty()) {
					System.out.println("No Employees in Organization");
				}else {
				System.out.println("Total Employees In Organization = "+employeList.size());
				}
				break;
			case 7:
				System.out.println("Program closed");
				break;
				default:
					System.out.println("Invalid Choise");
			}	
		}while(choice!=7);
		
		
            sc.close();
            
	}
	
}
