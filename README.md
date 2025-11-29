# 📌 Internship Tracker — Backend (Spring Boot + PostgreSQL)

This is the **REST API backend** powering the Internship Tracker.  
It manages companies, applications, and provides all CRUD operations using **Spring Boot, Spring Data JPA, and PostgreSQL**.  
The backend automatically deletes applications when their parent company is deleted.

> **Related Repository**: [Internship Tracker Frontend (Angular)]( https://github.com/e2sun/intership-application-tracker-frontend)
---

## 🚀 Features

### 🗂 Companies API
- Create company  
- Get all companies  
- Get company by ID  
- Delete company  
  - Also deletes all associated applications  

### 📝 Applications API
- Create application  
- Get all applications  
- Get applications by company  
- Update application  
- Delete application  

---

## 🛠 Tech Stack

- **Spring Boot 3**
- **Java 17**
- **PostgreSQL**
- **Maven**
- **Spring Data JPA**
- **CORS configured for Angular**

---

## 📂 Project Structure
```
src/main/java/com/example/interntracker/
├── controller/
│   ├── CompanyController.java
│   └── ApplicationController.java
│
├── model/
│   ├── Company.java
│   └── Application.java
│
├── repository/
│   ├── CompanyRepository.java
│   └── ApplicationRepository.java
│
└── service/
    ├── CompanyService.java
    └── ApplicationService.java
```

---

## 🔧 API Endpoints

### 🏢 Companies

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/companies` | Get all companies |
| GET | `/api/companies/{id}` | Get one company |
| POST | `/api/companies` | Create a company |
| DELETE | `/api/companies/{id}` | Delete a company + its applications |

### 📝 Applications

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/applications` | Get all applications |
| GET | `/api/applications/company/{id}` | Get applications for company |
| POST | `/api/applications` | Create application |
| PUT | `/api/applications/{id}` | Update application |
| DELETE | `/api/applications/{id}` | Delete application |

---

## ▶️ Running the Backend

### 1️⃣ Create PostgreSQL Database  
```sql
CREATE DATABASE intern_tracker;
```

### 2️⃣ Configure application.properties
```ini
spring.datasource.url=jdbc:postgresql://localhost:5432/intern_tracker
spring.datasource.username=postgres
spring.datasource.password=yourPassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.web.cors.allowed-origins=http://localhost:4200
spring.web.cors.allowed-methods=*
```

### 3️⃣ Run the Backend
```bash
mvn spring-boot:run
```

---

## 💾 Sample Data Seeding

This backend includes a sample data seeding script:
```
seed_sample_data.sh
```

Run it after starting the backend:
```bash
chmod +x seed_sample_data.sh
./seed_sample_data.sh
```

---

## 🖼 ER Diagram
```
Company (1) --- (∞) Application
```

**Company**
- id
- name
- location
- website
- notes

**Application**
- id
- roleTitle
- status
- dateApplied
- portalLink
- notes
- company_id

---

## ⭐ Future Enhancements

- JWT authentication
- Pagination
- Sorting + filtering from backend
- Role-based user accounts
- Activity history log per application

---

## 🏁 Status

Stable, fully functional API powering the Angular Internship Tracker.
