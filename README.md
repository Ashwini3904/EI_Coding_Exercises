# Educational Initiatives Coding Exercises 2025-26


## Overview

**This repository contains two exercises:**

* **Exercise 1** - Demonstrates various design patterns in Java with suitable real-world use cases, covering Creational, Structural, and Behavioral patterns.

* **Exercise 2** - A **console-based Virtual Classroom Manager** that allows efficient management of classrooms, students, and assignments in a simulated online learning environment.



## Exercise 1 (Design patterns)


## Creational Patterns

### 1. Factory Pattern - *E-Commerce Payment System*
Payment system for e-commerce checkout (Credit Card, PayPal, UPI).

### 2. Builder Pattern - *Student Portfolio Builder*
Student portfolio generator with optional details.


## Structural Patterns

### 1. Adapter Pattern - *Restaurant Menu System*
Converts XML restaurant menu to JSON for Fancy UI.

### 2. Decorator Pattern - *Online Learning Progress Report*
Progress report enhanced with badges and teacher feedback.


## Behavioral Patterns

### 1. Observer Pattern - *Channel Update Notifications* 
YouTube channel notifying subscribers of new video uploads.

### 2. Chain of Responsibility Pattern - *Authentication Workflow*  
check user → validate password → role access



## Exercise 2 (Mini-project)


## Virtual Classroom Manager

A **terminal-based Virtual Classroom Manager** built in Java for managing classrooms, students, and assignments.
Implements **OOP principles, SOLID design, and design patterns** to ensure clean and extensible code.


### Features

* Add, remove, and list classrooms
* Enroll and list students
* Schedule assignments with deadlines
* Submit assignments (with late check)
* View submissions → who submitted & who didn’t
* Students notified when assignments are scheduled or if they join late


### Design Patterns used in Virtual Classroom Manager

* Factory Pattern
* Observer Pattern
* Command Pattern


### Commands

add_classroom <ClassName>  
remove_classroom <ClassName>  
add_student <StudentId> <ClassName>  
schedule_assignment <ClassName> <AssignmentName> <DueDate:yyyy-MM-dd>  
submit_assignment <StudentId> <ClassName> <AssignmentName>  
list_classrooms  
list_students <ClassName>  
list_submissions <ClassName> <AssignmentName>  
exit  


## Key Learnings  
* Applied **SOLID principles** and **OOPS concepts** in practical scenarios.  
* Implemented **Creational, Structural, and Behavioral design patterns** with real-world use cases.  
* Built a console-based mini project (Virtual Classroom Manager) showcasing clean and extensible design. 

