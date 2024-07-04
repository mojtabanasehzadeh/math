# Factorial Service

This is a Spring Boot microservice that provides various mathematical factorial functions. The service exposes endpoints
to calculate the factorial, uneven factorial, and square factorial of a given number.

## Tech Stack

- **Java 21**
- **Spring Boot 3.3.1**
- **Gradle**
- **JUnit 5**
- **MockMvc** for integration testing

## Features

1. **Factorial**: Calculate the factorial of a number using recursion or list functions.
2. **Uneven Factorial**: Calculate the product of all odd numbers up to a given number.
3. **Square Factorial**: Calculate the product of squares of all numbers up to a given number.

## Setup and Running the Application

### Prerequisites

- Java 21 or higher
- Gradle

### Build the Project

`./gradlew build
`
### Run the Application

`./gradlew bootRun
`

The application will start on http://localhost:8080.

### Endpoints

#### 1. Factorial

Calculate the factorial of a number.
`GET http://localhost:8080/api/factorial/5
`
#### 2. Uneven Factorial
Calculate the product of all odd numbers up to a given number.
`GET http://localhost:8080/api/factorial/uneven/9
`
#### 3.Square Factorial
Calculate the product of squares of all numbers up to a given number.
`GET http://localhost:8080/api/factorial/square/4
`
### Testing
#### 1.Unit Tests

Run the unit tests using:
`./gradlew test`

#### 2.Integration Tests
Integration tests for the controller are included and can be run with the unit tests using the same command:
`./gradlew test`

#### 3.Testing via Browser

Start the application:
`./gradlew bootRun`

Open your browser and navigate to the following URLs to test the endpoints:
	
http://localhost:8080/rapid/api/factorial/5

http://localhost:8080/rapid/api/factorial/uneven/9

http://localhost:8080/rapid/api/factorial/square/4


#### 4.Testing via curl
Start the application: 
`./gradlew bootRun`

Use the following curl commands to test the endpoints:

`curl http://localhost:8080/rapid/api/factorial/5
`

`curl http://localhost:8080/rapid/api/factorial/uneven/9
`

`curl http://localhost:8080/rapid/api/factorial/square/4
`

### Configuration

The MathLibService can switch between recursive and list-based implementations of the factorial function. This can be
controlled via an application property:

`mathlib.useRecursion=true
`

Set this property in src/main/resources/application.properties to false if you want to use the list-based implementation
instead of recursion.