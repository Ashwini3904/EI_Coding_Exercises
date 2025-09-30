# Student Progress Report 

## Overview

This project demonstrates the Decorator Structural Design Pattern in Java by building a **customizable student progress report system**.

The base report shows only student grades. Using decorators, the report can be dynamically enhanced with features like badges, graphs, and teacher feedback without modifying the original class.


## Use Case: Progress Report

In an **online learning platform**, teachers want to provide progress reports to students.

* The **Base Report** shows grades only.
* Teachers can extend the report by adding:

  * **BadgeDecorator** - adds achievement badges.
  * **FeedbackDecorator** - adds teacher’s comments and suggestions.

With the **Decorator Pattern**, these enhancements can be applied **dynamically** and **independently**, giving flexibility in how student reports are presented.


## Why Decorator Design Pattern?

* Avoids creating multiple subclasses for every combination of features (e.g., ReportWithBadgesAndFeedback).
* Provides **dynamic composition** of features at runtime.
* Promotes **open/closed principle** - new features can be added without changing existing classes.
* Keeps the **base component (ProgressReport)** simple and focused.


## File Explanations

**1. client/ReportDemo.java**

* Demonstrates different versions of the report.
* Shows a basic report, report with badges, and report with badges + feedback.

**2. component/ProgressReport.java**

* Defines the component interface with the display() method.
* All reports and decorators implement this interface.

**3. component/BaseProgressReport.java**

* Concrete implementation of the base report.
* Displays only grades.

**4. decorator/ProgressReportDecorator.java**

* Abstract decorator class.
* Wraps a ProgressReport and delegates the display() method to it.

**5. decorator/BadgeDecorator.java**

* Concrete decorator that adds badges to the report.

**6. decorator/FeedbackDecorator.java**

* Concrete decorator that adds teacher’s feedback.

