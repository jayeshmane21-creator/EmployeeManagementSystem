# Employee Management System

A console-based **Employee Management System** developed using **Core Java**. This project demonstrates practical implementation of Object-Oriented Programming, Collections Framework, Exception Handling, and Java 8 Stream API.

## 📌 Project Overview

The Employee Management System is a console-based application that allows users to manage employee records efficiently.

The application supports different types of employees such as **Developer** and **Manager** and provides various operations including adding, displaying, searching, updating, deleting, counting, and sorting employees.

## 🚀 Features

* Add new employees
* Support for Developer and Manager employee types
* Display all employee details
* Search employee by ID
* Update employee ID, name, salary, and age
* Delete employee by ID
* Display total number of employees
* Sort employees by:

  * ID
  * Salary
  * Name
* Duplicate employee ID validation
* Age validation using custom exception
* Input validation using `IllegalArgumentException`

## ☕ Java Concepts Used

### Core Java

* Classes and Objects
* Constructors
* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Method Overriding

### Collections Framework

* `ArrayList`
* `HashSet`

`ArrayList` is used to store employee objects, while `HashSet` is used to maintain unique employee IDs.

### Exception Handling

* Custom Exception: `InvalidAgeException`
* `IllegalArgumentException`
* `try-catch`

### Java 8 Features

The project uses **Stream API** for employee sorting.

Examples of sorting operations:

* Sort by Employee ID
* Sort by Salary
* Sort by Name

The sorting implementation uses:

```java
employeList.stream()
    .sorted(Comparator.comparing(Employee::getSalary))
    .forEach(emp -> System.out.println(emp));
```

This approach replaced the previously separate comparator class and makes the sorting implementation more concise using Java 8 features.

## 🏗️ Project Structure

```text
EmployeeManagementSystem
│
└── src
    └── main
        └── java
            └── com.employee.management
                │
                ├── Employee.java
                ├── Developer.java
                ├── Manager.java
                ├── AllOperations.java
                ├── Employee_Main.java
                ├── InvalidAgeException.java
                └── module-info.java
```

## 📋 Menu Options

```text
-----Employee Management System-----
1. Add Employee
2. Display All Employee
3. Search Employee By Id
4. Update Employee
5. Delete Employee
6. Total Employees
7. Sort Employees
8. Exit
```

## 🔄 Employee Types

### Developer

The `Developer` class extends the `Employee` class and contains additional information about the programming language.

### Manager

The `Manager` class extends the `Employee` class and contains additional information about team size.

This demonstrates **inheritance and polymorphism** in Java.

## 🛡️ Validation

The project includes validation for:

* Duplicate employee IDs
* Invalid employee age
* Invalid employee ID
* Invalid salary
* Invalid age

A custom `InvalidAgeException` is used when an employee's age is below the required limit.

## 📚 What I Learned

Through this project, I practiced:

* Designing a Java console application
* Applying OOP principles
* Working with Collections
* Implementing CRUD operations
* Handling exceptions
* Using `HashSet` for unique IDs
* Using Java 8 Stream API
* Sorting objects using `Comparator.comparing()`
* Refactoring traditional sorting logic using Stream API

## 🔮 Future Enhancements

* Add database connectivity using MySQL
* Convert the application into a Spring Boot REST API
* Add a web-based frontend
* Add employee authentication
* Store employee records permanently

## 👨‍💻 Author

**Jayesh Mane**

Aspiring Java Backend Developer
