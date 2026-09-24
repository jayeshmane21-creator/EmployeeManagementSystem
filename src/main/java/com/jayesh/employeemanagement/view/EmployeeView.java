package com.jayesh.employeemanagement.view;

public class EmployeeView {

    public void displayMenu() {
        System.out.println("-----Employee Management System-----");
        System.out.println("1.Add Employee:");
        System.out.println("2.Display All Employee:");
        System.out.println("3.Search Employee By Id:");
        System.out.println("4.Update Employee:");
        System.out.println("5.Delete Employee:");
        System.out.println("6.Total Employees:");
        System.out.println("7.Sort Employees:");
        System.out.println("8.Exit");
        System.out.println("-----------------------------------");
        System.out.print("Enter Your Choice: ");
    }

    public void showExitMessage() {
        System.out.println("PROGRAM CLOSED");
        System.out.println("----------THANK YOU------------");
    }

    public void showInvalidChoice() {
        System.out.println("Invalid Choice");
    }
}