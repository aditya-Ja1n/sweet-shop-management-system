🍬 Sweet Shop Management System

A full-stack Sweet Shop Management System built using Spring Boot for the backend and React + Vite for the frontend.
This project was developed as part of a technical assignment with emphasis on security, clean architecture, and responsible AI usage.

🧠 Thought Process & Design Decisions
1. Understanding the Problem

The core requirement was to build a small but realistic system that demonstrates:

Authentication and authorization

Role-based access control

Secure backend APIs

A minimal but functional frontend

Rather than over-engineering, the focus was on clarity, correctness, and security.

2. Backend-First Approach

The backend was designed first, treating it as the source of truth.

Key decisions:

JWT-based stateless authentication was chosen to keep the system scalable and decoupled from server-side sessions.

Spring Security was used to enforce authorization rules at the API level instead of relying on frontend checks.

Role-based access (USER, ADMIN) was implemented to clearly separate public and restricted operations.

Passwords are stored using BCrypt to follow security best practices.

The backend follows a layered architecture:

Controllers handle HTTP concerns

Services encapsulate business logic

Repositories manage persistence

This separation keeps the code readable, testable, and maintainable.

3. Security Considerations

Security was treated as a first-class concern:

Public endpoints are explicitly whitelisted

Admin-only operations are protected at the HTTP method level

JWT validation is handled via a custom filter

The application is stateless to avoid session-related vulnerabilities

The intent was not just to “make it work”, but to make misuse difficult.

4. Frontend Philosophy

The frontend was intentionally kept simple and focused:

React + Vite was chosen for fast development and modern tooling

The UI demonstrates authentication flow and role-based access

Axios is used for API communication

Routing is handled using React Router

The frontend acts purely as a client, respecting backend security rules rather than duplicating them.

5. Trade-offs & Constraints

Due to time constraints:

Automated testing was deprioritized

UI styling was kept minimal

Swagger and extensive documentation were avoided

These trade-offs were conscious decisions to prioritize core functionality and correctness over polish.

🤖 My AI Usage
Tools Used

ChatGPT

How AI Was Used

Brainstorming authentication and authorization flow

Generating initial boilerplate for Spring Security and JWT

Debugging security configuration issues

Improving code readability and documentation

Refining the README to clearly explain intent and design choices

Reflection

AI acted as a productivity multiplier, especially when working with complex security configurations.
All AI-generated code was reviewed, understood, and adjusted manually to ensure correctness and alignment with the project goals.
