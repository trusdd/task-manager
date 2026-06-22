# 🌐 Task Manager API

> **Task Management System with JWT Authentication**  
> A production-ready REST API built with **Spring Boot 3** and **Java 17**, featuring secure user authentication and full CRUD operations.

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.0-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)](https://adoptium.net/)
[![JWT](https://img.shields.io/badge/JWT-Authentication-000000?style=for-the-badge&logo=json-web-tokens&logoColor=white)](https://jwt.io/)
[![H2](https://img.shields.io/badge/H2-Database-003B6F?style=for-the-badge&logo=h2&logoColor=white)](https://www.h2database.com/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)

---

## ✨ Key Features

*   **🔐 Secure Authentication:** JWT-based login and registration with Spring Security.
*   **👤 User Management:** Create account, login, and manage personal tasks.
*   **📋 Full Task CRUD:** Create, Read, Update, and Delete tasks securely.
*   **📊 Data Persistence:** H2 in-memory database for development, easily swappable.
*   **🚀 RESTful API:** Well-structured endpoints following best practices.
*   **🛡️ Security & Validation:** Password encoding, input validation, and role-based access.

---

## 🛠️ Tech Stack

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.0-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6.0-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-0A0A0A?style=for-the-badge&logo=json-web-tokens&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2_Database-003B6F?style=for-the-badge&logo=h2&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)

---

## 🚀 Quick Start Guide

### Prerequisites
*   **JDK 17** or later
*   **Maven** (or use the included `mvnw` wrapper)

### Run the application

```bash
# 1. Clone the repository
git clone https://github.com/trusdd/task-manager.git
cd task-manager

# 2. Build and run with Maven
./mvnw spring-boot:run   # On Windows: mvnw.cmd spring-boot:run
