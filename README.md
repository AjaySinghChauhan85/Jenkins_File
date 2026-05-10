# Jenkins_File
# AWS DevOps Portfolio Website

Modern responsive portfolio website built using Spring Boot, HTML, CSS, and JavaScript.

## Features

- Responsive modern UI
- AWS DevOps-themed portfolio
- Skills showcase
- Featured projects section
- Resume viewer
- Contact section
- Spring Boot integration
- Maven build support
- Tomcat deployment ready

---

# Technology Stack

- Java 17
- Spring Boot
- Thymeleaf
- HTML5
- CSS3
- JavaScript
- Maven
- Apache Tomcat

---

# Project Structure

```bash
src
 └── main
     ├── java
     │    └── com.springhow.example
     │         ├── Application.java
     │         └── HelloController.java
     │
     └── resources
          ├── templates
          │    └── index.html
          │
          └── static
               └── Ajay_Singh_Chauhan.pdf
```

---

# Clone Repository

```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/YOUR_REPOSITORY.git
```

---

# Move Into Project

```bash
cd YOUR_REPOSITORY
```

---

# Build Project

```bash
mvn clean package
```

Build output:

```bash
target/
```

---

# Run Application Locally

```bash
mvn spring-boot: run
```

Application runs on:

```bash
http://localhost:8080
```

---

# Run JAR File

```bash
java -jar target/portfolio-0.0.1-SNAPSHOT.jar
```

---

# Execute Tests

```bash
mvn test
```

---

# Production Deployment on Tomcat

## Step 1: Install Tomcat

Ubuntu:

```bash
sudo apt update
sudo apt install tomcat10 -y
```

---

## Step 2: Build WAR File

Update `pom.xml`:

```xml
<packaging>war</packaging>
```

Add Tomcat dependency:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
    <scope>provided</scope>
</dependency>
```

Build WAR:

```bash
mvn clean package
```

WAR file generated inside:

```bash
target/
```

---

## Step 3: Deploy WAR File

Copy WAR file:

```bash
sudo cp target/*.war /var/lib/tomcat10/webapps/
```

Restart Tomcat:

```bash
sudo systemctl restart tomcat10
```

---

## Step 4: Access Application

```bash
http://SERVER_IP:8080/PROJECT_NAME
```

Example:

```bash
http://65.0.99.166:8080/portfolio
```

---

# Jenkins CI/CD Pipeline

## Build Stage

```bash
mvn clean package
```

## Test Stage

```bash
mvn test
```

## Deploy Stage

```bash
cp target/*.war /var/lib/tomcat10/webapps/
```

---

# Resume Access

Resume PDF location:

```bash
src/main/resources/static/Ajay_Singh_Chauhan.pdf
```

Resume URL:

```bash
http://localhost:8080/Ajay_Singh_Chauhan.pdf
```

---

# Author

Ajay Singh Chauhan  
AWS DevOps Engineer

- AWS
- Jenkins
- Docker
- Kubernetes
- Terraform
- Linux
- Spring Boot
