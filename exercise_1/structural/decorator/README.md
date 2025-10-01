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


## Output Screenshot

<img width="406" height="182" alt="output_ss_decorator" src="https://github.com/user-attachments/assets/540c4efa-a29d-4217-8086-fd1d6a7b9eb7" />
