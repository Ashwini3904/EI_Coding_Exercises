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

## Output Screenshot

<img width="238" height="156" alt="output_ss_cor" src="https://github.com/user-attachments/assets/387b4ad0-15f9-4abe-a155-b6934df57c7a" />
