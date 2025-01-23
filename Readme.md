# My Spring Boot Application

This is a simple Spring Boot application that demonstrates how to load configuration properties from a YAML file and environment variables, and return them as a JSON response.

## Prerequisites

- Java 8 or higher
- Maven
- Spring Boot

## Configuration

### config.yml

The `config.yml` file contains the following properties:

```yaml
my:
  myMap:
    variable: "Hello, this is a print message from config.yml!"
    testVariable1: "This is test variable 1"
    testVariable2: "This is test variable 2"
