# Employee Management System

## Project Description

Employee Management System is a **Core Java console-based application** developed to manage employee information.

The application allows users to add, display, search, update, delete, count, and sort employee records.

The project also demonstrates important **Object-Oriented Programming concepts, Collections, Exception Handling, Custom Exception, and Comparator** in Java.

---

## Features

* Add new employees
* Support for Developer and Manager employees
* Display all employee details
* Search employee by ID
* Update employee information
* Delete employee by ID
* Display total number of employees
* Sort employees by ID
* Prevent duplicate employee IDs
* Validate employee age and salary
* Custom exception handling for invalid age

---

## Employee Types

### Developer

Developer employee contains:

* Employee ID
* Name
* Age
* Department
* Salary
* Programming Language

### Manager

Manager employee contains:

* Employee ID
* Name
* Age
* Department
* Salary
* Team Size

---

## Technologies Used

* Java
* Core Java
* Collections Framework
* Exception Handling
* OOP Concepts

---

## Java Concepts Used

* Class and Object
* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Method Overriding
* Constructor
* Getter and Setter
* Abstract Class
* Custom Exception
* ArrayList
* HashSet
* Iterator / Collection concepts
* Comparator
* `toString()`
* `Scanner`
* CRUD Operations

---

## Collections Used

### ArrayList

`ArrayList<Employee>` is used to store employee objects.

### HashSet

`HashSet<Integer>` is used to maintain unique employee IDs and prevent duplicate IDs.

---

## Exception Handling

The project uses:

* Custom `InvalidAgeException`
* `IllegalArgumentException`
* General exception handling

The custom exception is used to validate employee age.

---

## Sorting

The project uses the `Comparator` interface to sort employees by employee ID.

Example:

```java
Collections.sort(employeList, new SortComparator());
```

---

## Project Structure

```text
EmployeeManagementSystem
│
├── Employee.java
├── Developer.java
├── Manager.java
├── InvalidAgeException.java
├── SortComparator.java
├── AllOperations.java
└── EmployeeManagementSystem.java
```

---

## How to Run

1. Clone or download the project.
2. Open the project in any Java IDE such as Eclipse, STS, IntelliJ IDEA, or VS Code.
3. Make sure Java is installed and configured.
4. Run the main class:

```text
EmployeeManagementSystem.java
```

5. Select the required operation from the console menu.

---

## Example Operations

```text
1. Add Employee
2. Display Employee
3. Search Employee
4. Update Employee
5. Delete Employee
6. Total Employee
7. Sort Employee By ID
8. Exit
```

---

## Future Enhancements

The current version is a **Core Java console-based application**.

In the next version, this project can be enhanced using:

* Spring Boot
* REST APIs
* MySQL Database
* Spring Data JPA
* Hibernate
* Postman API Testing
* Frontend Integration

The project can then be converted from a console-based application into a **full-stack Employee Management System**.

---

## Author

**Jayesh Ramesh Mane**

BCA Graduate | Java Backend Developer Fresher
