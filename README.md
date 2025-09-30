# Exercise 1

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

