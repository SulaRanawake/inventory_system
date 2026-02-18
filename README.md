# Inventory Management System (Spring Boot + MySQL + JWT)

## Overview

This is a simple inventory management system with the following features implemented so far:

- User management (CRUD)
- Product management (CRUD)
- Inventory tracking
- Audit logging (create, update, delete, login, logout)
- Authentication using JWT
- Password hashing with BCrypt
- DTOs for API requests/responses

## Technologies used:

- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL (Hosted on AWS RDS)
- Lombok
- JWT
- Postman (for API testing)

## How to Test

Import Postman Collection: Postman Collection – Inventory System

<!-- Register User:
POST /auth/register → get JWT token

Login User:
POST /auth/login → get JWT token

Access Protected Endpoints:
Add Authorization: Bearer <token> header in Postman to call /api/users or /api/products. -->
