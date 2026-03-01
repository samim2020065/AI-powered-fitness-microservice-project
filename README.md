# 🏋️ AI-Powered Fitness Microservices Application

A Full Stack Microservices-based Fitness Application built using **Spring Boot + React** with AI integration.

This project demonstrates a real-world **Microservices Architecture** with polyglot persistence (multiple databases), service discovery, API gateway, centralized configuration, authentication, and AI integration.

---

# 📌 Architecture Overview

This application follows a distributed microservices architecture.

Client (React)
        ↓
Spring Cloud Gateway
        ↓
------------------------------------------------
|  User Service      → PostgreSQL             |
|  Activity Service  → MongoDB                |
|  AI Service        → MongoDB                |
------------------------------------------------
        ↓
Eureka (Service Discovery)
Config Server (Centralized Config)
Keycloak (Authentication & Authorization)
RabbitMQ (Async Communication)

---

# 🛠 Tech Stack

## Backend
- Spring Boot
- Spring Cloud Netflix (Eureka)
- Spring Cloud Gateway
- Spring Cloud Config Server
- Spring Security
- Keycloak
- RabbitMQ (Spring AMQP)

## Databases (Polyglot Persistence)
- PostgreSQL → User Service
- MongoDB → Activity Service
- MongoDB → AI Service

## AI Integration
- Google Gemini API

## Frontend
- React.js
- Axios
- React Router

---

# 📂 Microservices Breakdown

## 👤 User Service
- User registration
- Authentication support
- Profile management
- Stores data in **PostgreSQL**
- Uses Spring Data JPA

## 🏃 Activity Service
- Workout tracking
- Activity logging
- Stores flexible workout data in **MongoDB**
- Uses Spring Data MongoDB

## 🤖 AI Service
- AI-based fitness recommendations
- Workout analysis
- Integrates with Google Gemini API
- Stores AI interaction data in **MongoDB**

## 🌐 Gateway
- Single entry point
- Route-based request forwarding
- JWT validation

## 🧭 Eureka Server
- Service discovery
- Dynamic service registration

## ⚙ Config Server
- Centralized configuration management

---

# 🚀 How to Run

## 1️⃣ Start Databases

### PostgreSQL (for User Service)
Ensure database is running and create:
```

fitness_users_db

```

### MongoDB (for Activity & AI Services)
Ensure MongoDB is running locally on:
```

mongodb://localhost:27017

```

---

## 2️⃣ Start Infrastructure Services (Order Matters)

1. Config Server
2. Eureka Server
3. Keycloak
4. RabbitMQ

---

## 3️⃣ Start Microservices

Run:
- userservice
- activityservice
- aiservice
- gateway

Each service will auto-register with Eureka.

---

## 4️⃣ Start Frontend

```

cd fitness-app-frontend
npm install
npm run dev

```

Frontend runs on:
```

[http://localhost:5173](http://localhost:5173)

```

---

# 🔐 Security Architecture

- Keycloak handles authentication
- JWT tokens used for secure communication
- Gateway validates tokens
- Role-based access control (USER / ADMIN)

---

# 📊 Key Concepts Demonstrated

✔ Microservices Architecture  
✔ Polyglot Persistence (SQL + NoSQL)  
✔ Service Discovery  
✔ API Gateway  
✔ Centralized Config  
✔ Secure Authentication  
✔ Asynchronous Messaging (RabbitMQ)  
✔ AI Integration  

---