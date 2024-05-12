# Spring Boot API with Spring Data Rest

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-11-blue.svg)](https://jdk.java.net/11/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.0-green.svg)](https://spring.io/projects/spring-boot)
[![Spring Data Rest](https://img.shields.io/badge/Spring%20Data%20Rest-3.5.0-green.svg)](https://spring.io/projects/spring-data-rest)

A lightweight API built with Spring Boot and Spring Data Rest that automatically exposes CRUD endpoints without controllers.

## Features

- **Automatic API endpoints:** Spring Data Rest automatically exposes RESTful endpoints for your entities without the need for explicit controller implementations.
- **Simplified development:** Focus more on business logic and less on boilerplate code.
- **Easy customization:** Configure your entities, repositories, and endpoints according to your specific requirements.
- **Integrated security:** Seamlessly integrate security features provided by Spring Security for protecting your API.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven or Gradle

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/your-api.git
    ```

2. Navigate to the project directory:

    ```bash
    cd your-api
    ```

3. Build the project:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

The API will be accessible at `http://localhost:8080`.

## Configuration

### Database Configuration

By default, this API uses an in-memory H2 database for quick setup and testing. For production use, configure your preferred database in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_name
spring.datasource.username=db_username
spring.datasource.password=db_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
