## E-Commerce Payment System

## Overview

This project demonstrates the **Factory Design Pattern** using an **E-Commerce Payment System** as the use case.

In an online store, customers can pay using multiple payment methods (Credit Card, PayPal, UPI). Instead of hardcoding object creation in the client, the **Factory Method** dynamically creates the correct payment processor at runtime based on user input.

This ensures the system is **flexible, extensible, and loosely coupled**.


## Use Case: E-Commerce Payment

* An e-commerce site supports multiple payment methods:

  * **CreditCard**
  * **PayPal**
  * **UPI**

* Customer selects a method at checkout.

* The **Factory Method** creates the right payment processor object.

* Each processor implements its own pay() logic (validation, transaction simulation).


## Why Factory Design Pattern?

* Without a factory, the ECommerceApp client would need to know about **all concrete payment classes** (CreditCardPayment, PayPalPayment, UpiPayment).
* This leads to **tight coupling** and violates the **Open/Closed Principle** (adding new payment methods would require modifying client code).
* With the **Factory Method**, the client only depends on the **Payment abstraction**.
* New payment types can be added by extending Payment and updating the PaymentFactory, without touching the client.


## Output Screenshot

<img width="302" height="117" alt="output_ss_factory" src="https://github.com/user-attachments/assets/c03de354-adc9-419b-bdd7-c292bfb9eec8" />

