package com.employee.management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class AllOperations {
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> employeList = new ArrayList<>();
	
	HashSet<Integer> uniqueId = new HashSet<>();
	Employee employee;
	
	
	public void addEmployee() {
		System.out.print("Enter Number Of Employee: ");
		int numberOfEmployee=sc.nextInt();
		System.out.println();
		for(int i=0;i< numberOfEmployee;i++) {
			sc.nextLine();
			
			System.out.println("Emplyee Type:");
			System.out.println("1.Developer.");
			System.out.println("2.Manager.");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			
			int id;
			while(true) {
				System.out.print("Enter Employee id= ");
				id = sc.nextInt();
				if(uniqueId.contains(id)) {
					System.out.println("Id Is already Exists,Enter Another Id");
				}
				else {
					
					break;
				}
			}
			
			System.out.print("Enter Employee Name= ");
			String name=sc.next().toUpperCase();
			
			System.out.print("Enter Employee Age= ");
			int age=sc.nextInt();
			
			System.out.print("Enter Employee Deparment= ");
			String dpment=sc.next();
			
			System.out.print("Enter Employee Salary= ");
			double salary=sc.nextDouble();
			
			
			try {
				switch(choice) {
				case 1:
		
					System.out.print("Enter Programm Language= ");
					String programLanguage=sc.next();
			        
					employee=new Developer(id,name,age,dpment,salary,programLanguage);
					uniqueId.add(id);
				     employeList.add(employee);
				    
				     System.out.println("Employee added Successfully");
				     System.out.println();
					break;
				case 2:
					System.out.print("Enter Team Size= ");
					int size=sc.nextInt();
					
					employee=new Manager(id,name,age,dpment,salary,size);
					 uniqueId.add(id);
				     employeList.add(employee);
				  
				     System.out.println("Employee added Successfully");
				     System.out.println();
				     break;
				     default:
				    	 System.out.println("You select Invalid Employee Type.");
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
			
	}
	public void displayDetail() {
		
		if(employeList.isEmpty()) {
			System.out.println("Not Found Any Employee");
		}
		else {
		for(Employee e :employeList){
		    e.display();
		    e.work();
		    System.out.println();
		}
		}
	}
	public void searchById() {
		 System.out.print("Enter ID to Search: ");
		    int sId = sc.nextInt();

		    boolean isFound = false;

		    for (int i = 0; i < employeList.size(); i++) {
		        employee = employeList.get(i);
		       
		        if ( employee.getId() == sId) {
		        	
		        	 employee.display();
		        	 employee.work();      // Optional
		            isFound = true;
		            break;
		        }
		    }

		    if (!isFound) {
		        System.out.println("Employee Not Found.");
		    }
	}
	public void updateEmployee() {
		System.out.println("Enter Id Of employee for update:");
		int uId=sc.nextInt();
		boolean isEmpFound=false;
		for(int j=0;j<employeList.size();j++) {
			employee=employeList.get(j);
			if(employee!=null&&uId==employee.getId()) {
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
					
					int newId;
					try {
						
					while(true) {
						System.out.print("Enter New Id: ");
					      newId=sc.nextInt();
						if(newId != employee.getId() && uniqueId.contains(newId)) {
					       System.out.println("Employee Id Is Alredy Exists");
						}
						else {
						
							uniqueId.remove(employee.getId());
							employee.setId(newId);
							uniqueId.add(newId);
							System.out.println("ID Updated Successfully");
							System.out.println();
						
							break;
						}
					  }
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
				
				employee.setName(newName);
				System.out.println("Name Updated Successfully");
				System.out.println();
				
				isEmpFound = true;
				break;
				
				case 3:
					System.out.print("Enter New Salary:");
					double newSalary=sc.nextDouble();
					try {
						employee.setSalary(newSalary);
						System.out.println("Salary Updated Successfully");
						System.out.println();
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
					employee.setAge(newAge);
					System.out.println("Age Updated Successfully");
					System.out.println();
					
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
		
		}
		if(!isEmpFound) {
			System.out.println("Id is not found !Please Enter Valid Id");
		}
	}
	public void deleteEmployee() {
		System.out.println("Enter Id for Delete Emp:");
		int dId=sc.nextInt();
		boolean isdIDFound=false;
		for(int i=0;i<employeList.size();i++) {
			employee=employeList.get(i);
			if(employee !=null &&dId==employee.getId()) {
				employeList.remove(i);
				uniqueId.remove(dId);
		
				isdIDFound=true;
				System.out.println("Employee Deleted SuccessFully.");
				System.out.println();
				break;
			}
		}
		if(!isdIDFound) {
			System.out.println("Id Not found");
		}
	}
	public void totalEmployeeNumber() {
		if(employeList.isEmpty()) {
			System.out.println("No Employees in Organization");
		}else {
		System.out.println("Total Employees In Organization = "+employeList.size());
		}
	}
	public void EmployeesortById() {
		System.out.println("Employee Detail Sorted By ID:");
		Collections.sort(employeList, new SortComparator());
		for(Employee e:employeList) {
			System.out.println(e);
		}
		System.out.println();
	}
}
