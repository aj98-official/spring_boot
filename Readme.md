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
```

##Environment Variables

Set the following environment variable to include secret properties:

```sh
export MY_SECRET_MAP='{"secretVariable1":"Secret value 1","secretVariable2":"Secret value 2","secretVariable3":"Secret value 3"}'
```

##How Secret Variables are Loaded

The secret variables are loaded from the MY_SECRET_MAP environment variable, which contains a JSON string representing a map of secret properties. This JSON string is parsed and merged with the properties from config.yml in the ApplicationPropertyConfig class.
