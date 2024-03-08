
Course Application with Spring Boot and React.js
This project is a course management application built using Spring Boot for the backend and React.js for the frontend. It provides basic CRUD (Create, Read, Update, Delete) operations for managing courses.

Features
Create new courses with title and description
Retrieve existing courses
Update course information
Delete courses

Technologies Used

Backend (Spring Boot)
Spring Boot: Framework for building modern Java applications
Spring Data JPA: Simplifies database access and manipulation
Hibernate: ORM (Object-Relational Mapping) framework for mapping Java objects to database tables
MySQL: Relational database management system for data storage
Maven: Build automation tool for managing project dependencies and packaging

Frontend (React.js)
React.js: JavaScript library for building user interfaces
React Router: Declarative routing for React applications
Axios: Promise-based HTTP client for making API requests
Bootstrap: Front-end framework for building responsive and mobile-first websites

Project Structure

backend: Contains Spring Boot backend source code
src/main/java: Java source code files
com.example.courseapplication: Main package for the application
controller: Contains controller classes for handling HTTP requests
model: Defines the data model classes (e.g., Course)
repository: Spring Data JPA repositories for database access
service: Service layer classes for business logic
src/main/resources: Application properties and static resources
application.properties: Configuration file for database connection and other settings

frontend: Contains React.js frontend source code
src: React.js source code files
components: React components for UI rendering
services: Services for making API requests to the backend
