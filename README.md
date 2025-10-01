# Educational Initiatives Coding Exercises 2025-26


## Overview

**This repository contains two exercises:**

* **Exercise 1** - Demonstrates various design patterns in Java with suitable real-world use cases, covering Creational, Structural, and Behavioral patterns.

* **Exercise 2** - A **console-based Virtual Classroom Manager** that allows efficient management of classrooms, students, and assignments in a simulated online learning environment.



## Exercise 1 (Design patterns)


## Creational Patterns

### 1. Factory Pattern 
    *E-Commerce Payment System* - Payment system for e-commerce checkout (Credit Card, PayPal, UPI).

### 2. Builder Pattern 
    *Student Portfolio Builder* - Student portfolio generator with optional details.


## Structural Patterns

### 1. Adapter Pattern 
    *Restaurant Menu System* - Converts XML restaurant menu to JSON for Fancy UI.

### 2. Decorator Pattern 
    *Online Learning Progress Report* - Progress report enhanced with badges and teacher feedback.


## Behavioral Patterns

### 1. Observer Pattern 
    *Youtube Channel Subscription Notifications* - YouTube channel notifying subscribers of new video uploads.

### 2. Chain of Responsibility Pattern 
    *Authentication Workflow* - Authentication workflow (check user → validate password → role access).



## Exercise 2 (Mini-project)


## Virtual Classroom Manager

A **terminal-based Virtual Classroom Manager** built in Java for managing classrooms, students, and assignments.
Implements **OOP principles, SOLID design, and design patterns** to ensure clean and extensible code.



## Features

* Add, remove, and list classrooms
* Enroll and list students
* Schedule assignments with deadlines
* Submit assignments (with late check)
* View submissions → who submitted & who didn’t
* Students notified when assignments are scheduled or if they join late



## Design Patterns used in Virtual Classroom Manager

### 1. **Factory Pattern**

**Purpose:**

* Encapsulates object creation logic.
* Makes the system more flexible if creation rules change later.

**Relation to Use Case:**

* In a virtual classroom, new **students** and **assignments** are frequently created.
* Instead of directly instantiating (new Student() or new Assignment()), factories handle creation.
* This ensures consistency and makes adding extra logic (e.g., logging, default values) easier in the future.

### 2. **Observer Pattern**

**Purpose:**

* Defines a one-to-many relationship where **observers are automatically notified** when the subject’s state changes.

**Relation to Use Case:**

A **classroom (subject)** notifies all **students (observers)** whenever:

  * A new assignment is scheduled.
  * A student joins late (they are notified about existing assignments).
  
### 3. **Command Pattern**

**Purpose:**

* Centralizes how commands are **parsed and executed**, making it easier to extend new operations.

**Relation to Use Case:**

* The entire system is CLI-driven (console input).
* Each user command (add_classroom, add_student, etc.) needs to be validated and executed consistently.
* Having a single VirtualClassroomManager method (run() with switch-case) makes the CLI easy to extend.



## Commands

add_classroom <ClassName>  
remove_classroom <ClassName>  
add_student <StudentId> <ClassName>  
schedule_assignment <ClassName> <AssignmentName> <DueDate:yyyy-MM-dd>  
submit_assignment <StudentId> <ClassName> <AssignmentName>  
list_classrooms  
list_students <ClassName>  
list_submissions <ClassName> <AssignmentName>  
exit  

