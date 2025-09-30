# Student Portfolio Builder 

## Overview

This project demonstrates the **Builder Creational Design Pattern** in Java by creating customizable Student Portfolios.

Instead of having multiple constructors with complex parameter combinations, we use a step-by-step builder approach to construct portfolio objects flexibly.


## Use Case: Student Portfolio Builder

* A university placement system needs to generate student portfolios that showcase a student’s profile.
* Each portfolio may include details such as:

  * **Name**
  * **Email**
  * **Skills**
  * **Achievements**
  * **Experience**

* Since not all students have the same details (for example, freshers may not have experience), the system should allow creating customized portfolios with optional fields.


## Why Builder Design Pattern?

* Without the **Builder Pattern**, creating a portfolio would require a constructor with too many parameters (making it hard to read and maintain).
* Some fields are **optional** (e.g experience, email).
* Builder allows:

  * **Step-by-step construction** of objects.
  * **Flexibility** in choosing what to include.
  * **Validation** before object creation (e.g name is required).
* Ensures **clean separation of construction and representation**.


## File Responsibilities

**1. PortfolioApp.java**

* Acts as the client.
* Demonstrates creating different types of portfolios (experienced student and fresher).
* Uses the builder step by step to add details, then calls build().

**2. PortfolioBuilder.java**

* Defines the builder interface with methods to set name, email, skills, achievements, and experience.
* Declares build() method to construct the final StudentPortfolio.

**3. StudentPortfolio.java (Product Class)**

* Represents the final complex object built by the builder.
* Contains portfolio fields (name, email, skills, achievements, experience).
* Provides a custom toString() for display.

**4. StudentPortfolioBuilder.java (Concrete Builder)**

* Implements the PortfolioBuilder interface.
* Collects input values step by step.
* Validates required fields (e.g name must not be empty).
* Builds and returns a StudentPortfolio object.

