Sweet Shop Management System

A full-stack Sweet Shop Management System built using Spring Boot (Backend) and React + Vite (Frontend).
The application provides authentication using JWT, role-based authorization, and basic sweet inventory management.

This project was developed as part of a technical assignment with a strong emphasis on clean code, security, testing, and responsible AI usage.

Features
Backend (Spring Boot)

User Registration and Login using JWT authentication

Role-based access control (USER / ADMIN)

Public endpoint to view sweets

Admin-only endpoints to add and delete sweets

Stateless authentication using JWT

Secure password storage using BCrypt

Clean layered architecture (Controller → Service → Repository)

Frontend (React + Vite)

Login and Registration UI

Public sweets listing page

Admin-only add sweet page

Axios-based API communication

Basic navigation using React Router

Clean and presentable UI structure

Tech Stack
Backend

Java 17

Spring Boot

Spring Security

JWT (io.jsonwebtoken)

JPA / Hibernate

MySQL

JUnit 5 & Mockito

Frontend

React

Vite

Axios

React Router DOM

CSS

Project Structure
Sweet Shop/
│
├── Backend/
│   ├── src/main/java/com/sweetshop/demo
│   │   ├── auth
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── jwt
│   │   │   ├── model
│   │   │   └── repository
│   │   ├── config
│   │   └── sweets
│   └── src/test/java
│
├── Frontend/
│   ├── src
│   │   ├── api
│   │   ├── pages
│   │   ├── components
│   │   └── auth
│   └── package.json
│
└── README.md

How to Run the Project Locally
Backend Setup

Navigate to the backend folder:

cd Backend


Configure database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/sweetshop
spring.datasource.username=your_username
spring.datasource.password=your_password


Run the application:

mvn spring-boot:run


Backend will start at:

http://localhost:8080

Frontend Setup

Navigate to frontend folder:

cd Frontend


Install dependencies:

npm install


Start development server:

npm run dev


Frontend will start at:

http://localhost:5173

API Endpoints Overview
Auth

POST /api/auth/register

POST /api/auth/login

Sweets

GET /api/sweets (Public)

POST /api/sweets (ADMIN only)

DELETE /api/sweets/{id} (ADMIN only)

Authorization header:

Authorization: Bearer <JWT_TOKEN>

Testing Strategy

The backend follows Test-Driven Development (TDD) principles for core logic.

Test Coverage Includes:

Authentication service logic

JWT token generation and validation

User details loading logic

Controller behavior using mocked dependencies

Tools Used:

JUnit 5

Mockito

Spring Boot Test

Test Report Summary
Component	Tests Written	Status
AuthService	✅ Yes	Passed
CustomUserDetailsService	✅ Yes	Passed
JwtUtil	✅ Yes	Passed
AuthController	✅ Yes	Passed

Detailed test cases and assertions are documented in the test classes.

Screenshots

Screenshots of the frontend pages and API testing using Postman are included below:

Login Page

Sweets Listing Page

Add Sweet Page

Postman API Testing

(Attach screenshots here)

My AI Usage
AI Tools Used

ChatGPT

How AI Was Used

Generating initial backend boilerplate for security configuration

Debugging Spring Security and JWT authentication issues

Structuring frontend components and API integration

Generating unit test templates for backend services

Reviewing code for clean architecture and best practices

Writing this README documentation

Reflection on AI Usage

AI significantly accelerated development by helping identify misconfigurations, reducing debugging time, and improving overall code structure.
All AI-generated code was reviewed, understood, and modified manually to ensure correctness and alignment with project requirements.

AI was used as a productivity assistant, not a replacement for engineering judgment.

Git & Development Process

Git was used throughout development

Commits were made incrementally with descriptive messages

AI usage is transparently documented in commits where applicable

Code follows SOLID principles and clean coding practices

Future Improvements

Improve frontend UI/UX

Add pagination and search for sweets

Improve error handling and global exception responses

Increase test coverage for edge cases

Add Docker support

Conclusion

This project demonstrates secure backend development, clean architecture, responsible AI usage, and a practical approach to full-stack application development under real-world constraints.