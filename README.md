# Educational Initiatives Coding Exercises 2025-26


## Overview

**This repository contains two exercises:**

* **Exercise 1** - Demonstrates various design patterns in Java with suitable use cases, covering Creational, Structural, and Behavioral patterns.

* **Exercise 2** - A **console-based Virtual Classroom Manager** that allows efficient management of classrooms, students, and assignments in a simulated online learning environment.

---

## Exercise 1


## Creational Patterns

### 1. Factory Pattern – *E-Commerce Payment System*

**Use Case**:
* An e-commerce application supports multiple payment methods (CreditCard, PayPal, UPI).
* The **Factory Method** dynamically creates the right payment processor based on user input, ensuring flexibility and scalability.

### 2. Builder Pattern – *Student Portfolio Builder*

**Use Case**:
* A university placement system generates student portfolios with optional details like email, skills, achievements, and experience.
* The **Builder Pattern** allows step-by-step construction of customizable portfolios without telescoping constructors.



## Structural Patterns

### 1. Adapter Pattern – *Restaurant Menu System*

**Use Case**:
* A restaurant system maintains its menu in **XML format**, but a new **Fancy UI library** expects **JSON format**.
* The **Adapter Pattern** converts XML into JSON so the Fancy UI can seamlessly display the menu without changing existing systems.

### 2. Decorator Pattern – *Online Learning Progress Report*

**Use Case**:
* An online learning platform shows student progress reports.
* The **Decorator Pattern** allows dynamically adding features such as **badges, teacher feedback, graphs, or gamification elements** to the base report.



## Behavioral Patterns

### 1. Observer Pattern – *Youtube Channel Subscription Notifications*

**Use Case**:
* A **YouTube-like channel system** allows users to subscribe to channels.
* When the channel uploads a new video, all subscribers are automatically notified with the video details.
* Subscribers can also unsubscribe anytime and stop receiving further notifications.

### 2. Chain of Responsibility Pattern – *Authentication Workflow*

**Use Case**:
* An authentication system verifies user login step by step:

   1. Check if user exists
   2. Validate password
   3. Grant role-based access (User/Admin)

* The **Chain of Responsibility Pattern** ensures modular, reusable checks in sequence.

---

## Exercise 2


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

