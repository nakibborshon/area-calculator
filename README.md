# Area Calculator Application

## Overview

The Area Calculator is a Spring Boot application that provides RESTful API endpoints for calculating the areas of various geometric shapes such as rectangles, squares, and circles. This application is intended to demonstrate basic REST API development in Spring Boot with logging and unit testing.

## Features

- Calculate the area of a rectangle.
- Calculate the area of a square.
- Calculate the area of a circle.
- RESTful endpoints for easy integration with other services.
- Detailed logging for debugging and monitoring.
- Unit tests for service and controller layers.

## Technologies Used

- **Spring Boot**: Framework used to create stand-alone, production-grade Spring-based applications.
- **SLF4J with Logback**: Logging framework to generate logs.
- **JUnit 5**: Testing framework to write unit tests.
- **Maven**: Dependency management and build tool.

## Setup Instructions

### Prerequisites

- **Java 17** or later
- **Maven** installed on your machine
- An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor (e.g., VS Code)

### Clone the Repository

Clone the repository to your local machine:

```bash
git clone https://github.com/JPAtekur/area-calculator.git
cd area-calculator
```
### Build the Project
Navigate to the root directory of the project and build it using Maven:

```bash
mvn clean install
```
### Run the Application
You can run the application using Maven:

```bash
mvn spring-boot:run
```
Or by running the generated JAR file:

```bash
java -jar target/area-calculator-0.0.1-SNAPSHOT.jar
```
### Accessing the Application
By default, the application will run on http://localhost:9090. You can access the API endpoints using a browser, curl, or any API testing tool like Postman.

### API Endpoints
#### 1. Calculate Rectangle Area
Endpoint: `/area/rectangle`
Method: `GET`

#### Query Parameters:

* `length` (double): The length of the rectangle.
* `width` (double): The width of the rectangle.
Example Request:

```bash
curl "http://localhost:8080/area/rectangle?length=5&width=10"
```
Example Response:

```json
50.0
```
#### 2. Calculate Square Area
Endpoint: `/area/square`
Method: `GET`

#### Query Parameters:

* `side` (double): The side length of the square.
Example Request:

```bash
curl "http://localhost:8080/area/square?side=4"
```
Example Response:

```json
16.0
```
#### 3. Calculate Circle Area
Endpoint: `/area/circle`
Method: `GET`

#### Query Parameters:

* `radius` (double): The radius of the circle.
Example Request:

```bash
curl "http://localhost:8080/area/circle?radius=7"
```
Example Response:

```json
153.93804002589985
```
### Unit Testing
The application includes unit tests for the service and controller layers using JUnit 5 and MockMvc.

#### Running Tests
To run the tests, use the following command:

```bash
mvn test
```

#### Contact
For any queries or issues, please contact:

Author: Atekur Rahman
Email: atekur.rm@gmail.com
