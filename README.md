# 🚗 GarageFlow - Vehicle Service Management System

GarageFlow is a simple **Spring Boot backend project** designed to manage vehicle service records in a garage system.  
It demonstrates core backend development concepts like REST APIs, layered architecture, and CRUD operations.

---

## 📌 Project Overview

This project allows users to perform basic operations on vehicle service data such as adding, viewing, updating, and deleting records.

It is built using standard Spring Boot architecture:

- Controller Layer (API endpoints)
- Service Layer (business logic)
- Repository Layer (database interaction)
- Model Layer (entity definition)

---

## ⚙️ Features

- ➕ Add new vehicle service record
- 📋 View all vehicles
- 🔍 Get vehicle details by ID
- ✏️ Update vehicle information
- ❌ Delete vehicle record

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database / MySQL (configurable)
- Maven

---

## 📁 Project Structure


src/main/java/GarageFlow
│
├── controller → REST API endpoints
├── service → Business logic
├── repository → Database operations
├── model → Entity classes
│
└── GarageFlowApplication.java


---

## 🚀 How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/your-username/GarageFlow.git

2. Navigate to project folder
cd GarageFlow

3. Run the application
mvn spring-boot:run

4. Open in browser
http://localhost:8080

📡 API Endpoints
Method	Endpoint	Description
GET	/vehicles	Get all vehicles
GET	/vehicles/{id}	Get vehicle by ID
POST	/vehicles	Create new vehicle
PUT	/vehicles/{id}	Update vehicle
DELETE	/vehicles/{id}	Delete vehicle

📦 Sample JSON Request
Create Vehicle
{
  "vehicleName": "Honda City",
  "ownerName": "Rahul Sharma",
  "serviceType": "Oil Change"
}

🧠 What I Learned
Building REST APIs using Spring Boot
Layered architecture (Controller → Service → Repository)
CRUD operations with JPA
Handling HTTP requests
Structuring backend projects properly

👨‍💻 Author
Tanisha Sharma
Aspiring Backend Developer
(Java | Spring Boot | REST APIs)

⭐ Future Improvements
Add MySQL database integration
Add validation for inputs
Add exception handling
Add authentication (Spring Security)
Deploy project online
📌 Note

This is a learning project focused on backend development fundamentals and API design.


---
