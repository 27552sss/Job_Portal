# Job Portal System

A simple yet complete **Job Portal System** developed using **Java Spring Boot**, **Thymeleaf**, **MySQL**, and **Bootstrap**. It allows employers to post jobs and applicants to view and apply for them, with role-based authentication.

---

## 📝 Features

- User Registration and Login
- Role-based Access (Employer / Applicant)
- Post a Job (Employer only)
- View All Jobs (Public)
- Secure Authentication with Spring Security

---

## 🛠️ Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **Spring Data JPA**
- **MySQL**
- **Thymeleaf**
- **Maven**

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL

### Steps to Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/job-portal.git
   cd job-portal
   ```

2. Create a MySQL database named `job_portal`.

3. Update your `application.properties` with your DB credentials:
   ```properties
   spring.datasource.username=yourUsername
   spring.datasource.password=yourPassword
   ```

4. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access it at: [http://localhost:8080](http://localhost:8080)

---

## 👨‍💼 Default Test User

- Username: `employer1`
- Password: `pass123`

> Automatically inserted if not already present.

---

## 🎨 Output Preview

### Homepage (`/jobs`)
Displays all jobs available for public viewing.

### Post Job (`/employer/post-job`)
Employers can add new job listings.

### Authentication Pages
- `/login`: User login interface
- `/register`: New user registration

---

## 📁 Project Structure

```
src/
 └── main/
      ├── java/
      │    └── com.example.Job_Portal/
      │         ├── controller/
      │         ├── model/
      │         ├── repository/
      │         ├── service/
      │         └── JobPortalApplication.java
      └── resources/
           ├── templates/
           |── application.properties
```

---
