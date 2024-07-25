# E-commerce Microservices Application

This is a Spring Boot-based e-commerce application consisting of three microservices: Cart, Product, and User.  

## Table of Contents
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Clone the Repository](#clone-the-repository)
  - [Build and Run the Application](#build-and-run-the-application)
  - [API Endpoints](#api-endpoints)
- [JWT Authentication](#jwt-authentication)
  - [Generating JWT Token](#generating-jwt-token)
  - [Using JWT Token](#using-jwt-token)
- [Database Configuration](#database-configuration)
- [Notes](#notes)

## Architecture

This application follows a microservices architecture with the following services:
1. **Cart Service:** Manages the shopping cart.
2. **Product Service:** Manages product details.
3. **User Service:** Manages user details and authentication.

All services communicate with each other via REST APIs.

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- PostgreSQL
- JWT (JSON Web Token)
- Maven

## Prerequisites

- Java 8 or higher
- Maven 3.6 or higher
- PostgreSQL
- An IDE (IntelliJ IDEA, Eclipse, etc.)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/your-repository/ecommerce-microservices.git
cd ecommerce-microservices

