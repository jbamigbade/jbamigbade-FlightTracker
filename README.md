# Flight Management System (Java)

A console-based backend application for managing flight information, developed as part of Revature training. This project demonstrates layered Java architecture, JDBC integration, SQL handling, and modular development practices.

## ✈️ Features
- Add, retrieve, and update flight records
- Layered architecture (Controller, Service, DAO, Model)
- JDBC connection with `ConnectionUtil.java`
- SQL integration for persistent flight data
- Console logging for tracking system actions
- Basic testing via `FlightAppTest.java`

## 🛠️ Tech Stack
- Java
- JDBC
- SQL (compatible with H2/MySQL)
- Maven
- Gitpod / VS Code

## 🚀 Future Enhancements
- RESTful API endpoints using Spring Boot
- Integration with a web-based frontend
- JWT authentication and role-based access
- Docker containerization
- Cloud deployment via AWS or GCP

## 📂 Project Structure
src/
└── main/java/Application
├── Controller/
├── DAO/
├── Model/
├── Service/
└── Util/
