# Spring-Repo
🌿 Spring Core

This repository contains simple, well-structured Java examples that demonstrate the **core concepts of the Spring Framework**. These programs are focused on understanding how Spring manages objects, dependencies, and configurations using its powerful IoC (Inversion of Control) container.

It is ideal for Java developers and students who are beginning to learn **Spring Core** and want hands-on practice without the complexity of Spring Boot.

---

## 📚 What You'll Learn

- Understanding Inversion of Control (IoC) and Dependency Injection (DI)
- Defining and managing beans using XML and annotation-based configurations
- Bean scopes (`singleton`, `prototype`, etc.)
- Bean lifecycle methods (`init-method`, `destroy-method`, `@PostConstruct`, `@PreDestroy`)
- Constructor vs Setter Injection
- Autowiring and component scanning
- ApplicationContext vs BeanFactory

---

## 🛠️ Technologies Used

- Java (JDK 8 or above)
- Spring Framework (Core Container)
- Maven (for dependency management)
- IDE (Eclipse or IntelliJ IDEA)

---

## 🗂️ Project Structure

spring-core-examples/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/
│ │ │ ├── config/
│ │ │ ├── model/
│ │ │ ├── service/
│ │ │ └── App.java
│ │ └── resources/
│ │ └── applicationContext.xml
├── pom.xml
└── README.md

🧠 Sample Use Cases Covered :

Injecting a service class into a controller using constructor injection.

Demonstrating multiple beans with different scopes.

Lifecycle hooks that execute during bean initialization and destruction.

Switching from XML to annotation-based configuration with @Component, @Autowired, and @Configuration.


📌 Note
This project is intentionally built without Spring Boot to help you understand the internal workings of Spring Core and the IoC container in a transparent and beginner-friendly way.
Edit

