# youtube-tutorials

I will add the code for the Java Challengers Youtube tutorials here. 

# Solid

## SRP - Single Reponsibility Principle

- One reason to change
- Imagine a tool box
- A screwdriver will...
- A hammer will...
- The tape measure will...

- Would it make sense for a User management system to handle email notification, logging data or saving an order?

## Why is SRP important?

- Clarity
- Maintanability
- Reduced Impact on Changes

## Modularity and Microservices are concepts related to SRP

## Microservices Architecture

- User Service
Responsibility: Manages user information, authentication, and profiles.
Technologies: Python, Flask for a RESTful API, and PostgreSQL for data storage.

- Product Service
Responsibility: Manages product inventory, descriptions, and categories.
Technologies: Java with Spring Boot, and MongoDB for flexible data storage.

- Order Service
Responsibility: Handles order creation, status updates, and history.
Technologies: C# with .NET Core, and SQL Server for transactional data integrity.

- Payment Service
Responsibility: Processes payments and manages payment methods.
Technologies: Node.js with Express, and Stripe for payment processing.

## Not using SRP 

Monolithic Architecture
E-Commerce Service
Responsibilities: Manages users, products, orders, and payments all within a single application.
Technologies: Java with Spring Boot, and a single MySQL database.


