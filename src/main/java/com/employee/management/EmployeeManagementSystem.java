package com.employee.management;

import java.util.Scanner;



public class EmployeeManagementSystem {

	
	public static void displayMenu() {
		System.out.println("-----Employee Management System-----");
		System.out.println("1.Add Employee:");
		System.out.println("2.Display All Employee:");
		System.out.println("3.Search Employee By Id:");
		System.out.println("4.Update Employee:");
		System.out.println("5.Delete Employee:");
		System.out.println("6.Total Employees:");
		System.out.println("7.Emplyee Display By ID:");
		System.out.println("8.Exite");
		System.out.println("-----------------------------------");
		System.out.print("Enter Your Choise:");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AllOperations employee = new AllOperations();
		int choice;
		
		do {
			
			displayMenu();
			 choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				employee.addEmployee();
				break;
			case 2:
				employee.displayDetail();
			break;
			case 3:
			   employee.searchById();
			    break;
			case 4:
				employee.updateEmployee();
				break;
				
			case 5:
				employee.deleteEmployee();
				break;
			case 6:
				employee.totalEmployeeNumber();
				break;
			case 7:
				employee.EmployeesortById();
				break;
			case 8:
				System.out.println("Program closed");
				System.out.println("----------THANK YOU------------");
				System.exit(0);
				break;
				
				default:
					System.out.println("Invalid Choise");
			}	
		}while(choice!=8);
		
		
            sc.close();
            
	}
	
}
