# Authentication System

## Overview

This project demonstrates the Chain of Responsibility Behavioral Design Pattern in Java by implementing a simple authentication and authorization workflow.

Instead of writing one big block of code for login validation, the system breaks the logic into a **chain of handlers**:

1. **UserExistsHandler** - checks if the username exists.
2. **ValidPasswordHandler** - validates the entered password.
3. **RoleCheckHandler** - checks the user’s role (Admin/User).

The request flows through the chain, and each handler decides whether to process the request or stop it.


## Use Case 

An **authentication system** requires multiple checks before granting access:

* Verify if the **user exists** in the database.
* Verify if the **password is correct**.
* Assign role-based access (**Admin/User** dashboards).

The **Chain of Responsibility Pattern** allows these checks to be modular, reusable, and executed in sequence.


## Why Chain of Responsibility?

* Avoids **long if-else chains** inside a single login method.
* Each check (handler) has **one responsibility**.
* Order of checks can be easily changed by reordering the chain.
* New checks (e.g account lock, 2FA, captcha verification) can be added without modifying existing code.


## File Explanations

**1. client/AuthApp.java**

* Entry point of the program.
* Builds the chain: UserExistsHandler -> ValidPasswordHandler -> RoleCheckHandler.
* Tests different login scenarios (unknown user, wrong password, normal user, admin).

**2. client/AuthService.java**

* Wraps the authentication process.
* Passes login requests into the handler chain.

**3. data/Database.java**

* A mock in-memory database storing usernames and passwords.
* Provides methods to check user existence and validate passwords.

**4. handler/Handler.java**

* Abstract base class for all handlers.
* Stores the reference to the next handler in the chain.
* Provides the handleNext() method to delegate responsibility.

**5. handler/UserExistsHandler.java**

* First handler in the chain.
* Verifies whether the username exists in the database.

**6. handler/ValidPasswordHandler.java**

* Second handler in the chain.
* Validates the entered password for the given username.

**7. handler/RoleCheckHandler.java**

* Final handler in the chain.
* Grants role-based access → Admin Dashboard or User Dashboard.

