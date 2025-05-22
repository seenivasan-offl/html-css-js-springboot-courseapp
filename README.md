# html-css-js-springboot-courseapp
# 📚 Fullstack Course Registration System

A full-stack web application to manage course registrations using **HTML**, **CSS**, **JavaScript**, and **Spring Boot**.

---

## 📁 Project Structure
course-registration/
├── frontend/
│ ├── index.html
│ ├── registration.html
│ ├── availcourse.html
│ ├── enroll.html
│ ├── style.css
│ └── myScript.js
├── backend/
│ ├── src/
│ ├── pom.xml
│ └── application.properties
└── README.md

---

## 🚀 Technologies Used

- **Frontend**: HTML, CSS, JavaScript  
- **Backend**: Java, Spring Boot  
- **Build Tool**: Maven  
- **Data Format**: JSON (REST API)  

---

## 🔧 Features

- View available courses  
- Register users for a course  
- View enrolled students  
- Dynamic interaction using JavaScript `fetch()` API  

---

## 🔨 How to Run the Project

### 1. Backend (Spring Boot)  
- Navigate to the `backend` folder.  
- Run the Spring Boot app:  
  ```bash  
  mvn spring-boot:run  
App runs at http://localhost:8080

2. Frontend
Navigate to the frontend folder.

Open index.html using any browser (or use Live Server extension in VS Code).

📡 REST API Endpoints
Method	Endpoint	Description
GET	/course	Get all available courses
POST	/register	Register a student/course
GET	/enrolled	View enrolled students

🙋‍♂️ Author
Seenivasan H.
Email: seenivasan9427@gmail.com
LinkedIn: https://www.linkedin.com/in/seeni-vasan-h
