# 🎓 Spring JDBC - Find All Students (PostgreSQL Console App)

This is a basic Spring Boot project demonstrating how to use **Spring JDBC** with **PostgreSQL** to fetch all student records from the database using `JdbcTemplate` and `RowMapper`. The result is printed directly in the console.

## 📚 Topics Covered

- Spring JDBC setup
- Spring Boot integration
- Using `JdbcTemplate.query()` to retrieve records
- Implementing custom `RowMapper`
- Connecting Spring Boot to PostgreSQL
- Loading initial schema and data

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring JDBC
- PostgreSQL
- Maven

## 📁 Project Structure

```
src/
├── model/
│   └── Student.java
├── repository/
│   ├── StudentRepository.java
│   └── StudentRowMapper.java
├── service/
│   └── StudentService.java
└── Application.java
```

## 🗃️ Database Setup

Make sure PostgreSQL is running and a database is created.

### 🔹 schema.sql

```sql
CREATE TABLE student (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);
```

### 🔹 data.sql

```sql
INSERT INTO student (name, email) VALUES
('Jonnes Vasanth', 'jonnes@example.com'),
('Alice', 'alice@example.com');
```

### 🔧 application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.initialization-mode=always
```

## ▶️ How to Run

1. Clone the repository  
2. Update your PostgreSQL credentials in `application.properties`  
3. Run the application:

```bash
./mvnw spring-boot:run
```

You’ll see the list of students printed in the console output.

---

## 🙋 Author

**Jonnes Vasanth**  
Java | Spring Boot | JDBC | PostgreSQL  
🔗 [LinkedIn](https://www.linkedin.com/in/jonnes-vasanth-a-934335248/)
