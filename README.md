# 🏦 Banking Application

A simple banking application built with **Spring Boot** and **MySQL** that allows users to create bank accounts, view account details, deposit and withdraw money. This project demonstrates the basic usage of RESTful APIs, data persistence using Spring Data JPA, and database operations with MySQL.

## 📌 Features

- Create a new bank account
- Get details of a single account
- List all accounts
- Deposit money into an account
- Withdraw money from an account

## 🛠️ Technologies Used

- Java 23+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Spring Web
- Lombok

---

## 📂 Project Structure

```
BankingProject/
├── controller/
│   └── AccountController.java
├── service/
│   └── AccountService.java
├── entity/
│   ├── Account.java
│   └── AccountRepository.java
├── BankingProjectApplication.java
└── resources/
    └── application.properties
```

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- MySQL installed and running
- Maven

### Setup

1. **Clone the repository**

```bash
git clone https://github.com/your-username/BankingProject.git
cd BankingProject
```

2. **Create MySQL database**

```sql
CREATE DATABASE Banking;
```

3. **Configure application.properties**

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/Banking
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```

4. **Run the application**

```bash
./mvnw spring-boot:run
```

---

## 🌐 API Endpoints

| Method | Endpoint                | Description                 |
|--------|-------------------------|-----------------------------|
| GET    | `/api/accounts`         | Get all accounts            |
| GET    | `/api/accounts/{id}`    | Get account by ID           |
| POST   | `/api/accounts`         | Create a new account        |
| POST   | `/api/accounts/{id}/deposit` | Deposit money into account |
| POST   | `/api/accounts/{id}/withdraw`| Withdraw money from account|

---

## 🧩 Component Breakdown

### 🔹 AccountController.java

Handles all HTTP requests and maps them to service methods. Provides RESTful endpoints to interact with the application.

### 🔹 AccountService.java

Contains business logic such as depositing, withdrawing, fetching, and saving accounts.

### 🔹 AccountRepository.java

Interface extending `JpaRepository` to interact with the MySQL database.

### 🔹 Account.java

The entity representing a bank account. It includes `id`, `accountHolderName`, and `balance`.

### 🔹 BankingProjectApplication.java

Main class that boots the Spring application.

---

## 🖼️ Screenshots

Post
![Screenshot 2025-04-07 201439 png](https://github.com/user-attachments/assets/7340ba80-b74d-42f2-ae2f-a6421fe71427)

Deposit Money into an account
![Screenshot 2025-04-07 202340 png](https://github.com/user-attachments/assets/c91847e4-f2a9-45bc-b199-60a4038de970)

Withdraw Money from an account
![Screenshot 2025-04-07 202540 png](https://github.com/user-attachments/assets/a9a0dad3-e590-40f3-b111-8a5d1c3a67fb)

---

## 🤝 Contributing

All contributions, bug reports, bug fixes, documentation improvements, enhancements, and ideas are welcome.

---

## 📃 License

This project is open-source and available under the [MIT License](LICENSE).
