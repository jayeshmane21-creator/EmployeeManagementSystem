package com.jayesh.employeemanagement;

import java.util.Scanner;

import com.jayesh.employeemanagement.controller.EmployeeController;
import com.jayesh.employeemanagement.service.EmployeeService;
import com.jayesh.employeemanagement.view.EmployeeView;

public class Main {
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService employee = new EmployeeService();
		EmployeeView view = new EmployeeView();
		EmployeeController controller = new EmployeeController(employee);
		int choice;

		do {

			view.displayMenu();
			choice = sc.nextInt();
			if (choice == 8) {
			    view.showExitMessage();
			} else {
			    controller.handleChoice(choice);
			}
		} while (choice != 8);

		sc.close();

	}

}
