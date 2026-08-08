# Employee Management System

A Java console-based Employee Management System developed using **Object-Oriented Programming (OOP)** concepts and the **Java Collection Framework**. The application manages employee records and provides CRUD operations such as adding, displaying, searching, updating, and deleting employees.

## 📌 Project Overview

The Employee Management System is a console-based Java application designed to manage different types of employees such as **Developers** and **Managers**.

The project demonstrates practical implementation of Java concepts including:

* Object-Oriented Programming
* Abstract Classes
* Inheritance
* Encapsulation
* Polymorphism
* Method Overriding
* Exception Handling
* Custom Exceptions
* LinkedList
* CRUD Operations
* Input Validation

## 🚀 Features

### 1. Add Employee

* Add multiple employees in a single operation.
* Supports two employee types:

  * Developer
  * Manager
* Validates employee ID, age, and salary.
* Prevents duplicate employee IDs.
* Developer-specific programming language can be stored.
* Manager-specific team size can be stored.

### 2. Display All Employees

* Displays complete employee information.
* Calls employee-specific `work()` behavior using polymorphism.

### 3. Search Employee

* Search an employee using Employee ID.
* Displays employee details when the ID is found.
* Shows an appropriate message when the employee does not exist.

### 4. Update Employee

Employee information can be updated using Employee ID.

Available update options:

* Employee ID
* Employee Name
* Employee Salary
* Employee Age

The application also validates updated values.

### 5. Delete Employee

* Delete an employee using Employee ID.
* Displays a message when the entered ID does not exist.

### 6. Total Employees

* Displays the total number of employees currently stored in the system.

### 7. Input Validation & Exception Handling

The application handles invalid input using:

* Custom `InvalidAgeException`
* `IllegalArgumentException`
* General exception handling
* Duplicate employee ID validation
* Positive value validation for ID, age, and salary

## 🧑‍💻 Employee Types

### Developer

A Developer extends the `Employee` abstract class and contains an additional property:

* Programming Language

The `work()` method is overridden to represent developer-specific behavior.

### Manager

A Manager extends the `Employee` abstract class and contains an additional property:

* Team Size

The `work()` method is overridden to represent manager-specific behavior.

## 🏗️ OOP Concepts Used

### Encapsulation

Employee fields such as ID, name, age, department, and salary are declared `private` and accessed using getters and setters.

### Abstraction

`Employee` is an abstract class that defines common employee properties and the abstract `work()` method.

### Inheritance

`Developer` and `Manager` inherit common properties and behavior from the `Employee` class.

### Polymorphism

An `Employee` reference is used to store both `Developer` and `Manager` objects.

The overridden `work()` and `display()` methods demonstrate runtime polymorphism.

### Method Overriding

Both `Developer` and `Manager` override the `display()` and `work()` methods.

## 📚 Java Concepts Used

* Classes and Objects
* Constructors
* Access Modifiers
* Encapsulation
* Abstract Classes
* Inheritance
* Polymorphism
* Method Overriding
* Exception Handling
* Custom Exception
* `LinkedList`
* `Scanner`
* Loops
* Conditional Statements
* CRUD Operations
* Input Validation

## 🛠️ Technologies Used

| Technology         | Usage                    |
| ------------------ | ------------------------ |
| Java               | Application development  |
| Java Collections   | Employee data management |
| LinkedList         | Storing employee objects |
| Scanner            | User input               |
| Exception Handling | Handling invalid inputs  |

## 📂 Project Structure

```text
EmployeeManagementSystem
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── employee
│   │               └── management
│   │                   └── EmployeeManagementSystem.java
│   │
│   └── test
│
├── pom.xml
├── .gitignore
└── README.md
```

## ▶️ How to Run

### Prerequisites

* Java JDK installed
* Maven installed/configured
* IDE such as Spring Tool Suite, Eclipse, IntelliJ IDEA, or VS Code

### Run the Application

1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Build the Maven project.
4. Run:

```text
EmployeeManagementSystem.java
```

5. Select the required option from the console menu.

## 📋 Application Menu

```text
-----Employee Management System-----
1. Add Employee
2. Display All Employee
3. Search Employee By Id
4. Update Employee
5. Delete Employee
6. Total Employees
7. Exit
-----------------------------------
```

## 🔮 Future Enhancements

The project can be extended with:

* MySQL database integration
* JDBC
* Spring Boot REST API
* Web-based user interface
* Employee login/authentication
* Advanced search and filtering
* Sorting employees by salary, age, or name
* Separate service and repository layers

## 🎯 Learning Objective

The main objective of this project is to apply Core Java and Object-Oriented Programming concepts to a practical problem while developing a simple employee management application.

## 👨‍💻 Author

**Jayesh Ramesh Mane**

Java Backend Developer | Fresher

---

⭐ If you find this project useful, feel free to explore the repository.
