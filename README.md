# myrepositry123
# 🧩 Spring Boot CRUD Application with Swagger Documentation

This is a simple yet powerful **Spring Boot** project that implements full **CRUD (Create, Read, Update, Delete)** operations using REST APIs. The project uses **Spring Data JPA** to interact with a **MySQL database** and is enhanced with **Swagger UI** for easy API testing and documentation.

---

## 🚀 Features

- Full CRUD functionality using RESTful APIs
- Integration with MySQL using Spring Data JPA
- Auto-generated Swagger UI documentation
- Clean and layered architecture (Entity, Repository, Service, Controller)
- Easy testing with Swagger or Postman

---

## 🛠 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **Swagger (Springfox / Springdoc OpenAPI)**
- **Maven**

---

## ⚙️ Project Structure

├── Entity │ └── User.java ├── Repository │ └── UserRepository.java ├── Service │ └── UserService.java ├── Controller │ └── UserController.java ├── Application │ └── MainApplication.java


---

## 🧑‍💻 API Endpoints

| Method | Endpoint         | Description            |
|--------|------------------|------------------------|
| GET    | `/users`         | Get all users          |
| GET    | `/users/{id}`    | Get user by ID         |
| POST   | `/users`         | Create a new user      |
| PUT    | `/users/{id}`    | Update existing user   |
| DELETE | `/users/{id}`    | Delete user by ID      |

---

## 📄 Swagger UI

The project includes **Swagger UI** for easy API testing.

- Once the application is running, open your browser and go to:

http://localhost:8080/swagger-ui/index.html


- This page will show all available endpoints, parameters, responses, and allow you to test them directly.


---

## 📦 How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone :https://github.com/priyanshu-234/myrepositry123
   

spring.datasource.url=jdbc:mysql://localhost:3306/your_database 
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
springdoc.api-docs.path=/v3/api-docs

Run the application:

mvn spring-boot:run

Access Swagger UI:

Open your browser and go to: http://localhost:8080/swagger-ui/index.html
Example JSON Payload

{
  "id": 1,
  "name": "Priyanshu",
  "email": "shuklapriyanshu6292@gmail.com"
}

🙌 Author
Made with ❤️ by Priyanshu Shukla
