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


## File Explanations

**1. client/ECommerceApp.java**

* Acts as the main entry point of the application.
* Handles user input for amount, payment method, and details.
* Uses PaymentFactory to create the appropriate payment object.
* Executes the payment process.

**2. factory/PaymentFactory.java**

* Implements the **Factory Method**.
* Responsible for creating and returning the correct Payment subclass.
* Ensures centralized object creation and reduces coupling in the client.

**3. product/Payment.java (Abstract Class)**

* Defines the common contract for all payment types.
* Holds the transaction amount as a base property.
* Declares the pay() method to be implemented by subclasses.

**4. product/CreditCardPayment.java**

* Concrete implementation of Payment for credit card transactions.
* Masks and displays only the last digits of the card number.
* Simulates processing of credit card payments.

**5. product/PayPalPayment.java**

* Concrete implementation of Payment for PayPal transactions.
* Uses the customer’s email ID as the PayPal identifier.
* Simulates processing of PayPal payments.

**6. product/UpiPayment.java**

* Concrete implementation of Payment for UPI transactions.
* Uses the customer’s UPI ID for processing.
* Simulates processing of UPI payments.
