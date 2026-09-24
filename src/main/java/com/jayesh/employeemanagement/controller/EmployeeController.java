package com.jayesh.employeemanagement.controller;

import com.jayesh.employeemanagement.service.EmployeeService;

public class EmployeeController {

    private EmployeeService employee;

    public EmployeeController(EmployeeService employee) {
        this.employee = employee;
    }

    public void handleChoice(int choice) {

        switch (choice) {

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
            employee.SortEmployee();
            break;

        default:
            System.out.println("Invalid Choice");
        }
    }
}