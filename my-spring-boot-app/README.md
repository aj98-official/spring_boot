# My Spring Boot Application

This is a simple Spring Boot application that demonstrates how to create a RESTful web service that returns "Hello World".

## Project Structure

```
my-spring-boot-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── MySpringBootApp.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── MySpringBootAppTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven

## Running the Application

1. Navigate to the project directory:
   ```
   cd my-spring-boot-app
   ```

2. Run the application using the Maven wrapper:
   ```
   ./mvnw spring-boot:run
   ```

3. Open your web browser and go to:
   ```
   http://localhost:8080/hello
   ```

You should see the message "Hello World".

## Testing the Application

To run the tests, use the following command:
```
./mvnw test
```

This will execute the test cases defined in `MySpringBootAppTests.java`.