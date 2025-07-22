# DI Application

A Simple Java application having Dependency Injection using Guice.

## Project Structure
```
application
├── Main.java
└── communication
    ├── controllers
    │   ├── CommController.java
    │   └── implementation
    │       ├── EmailController.java
    │       └── SMSController.java
    ├── modules
    │   └── CommModule.java
    └── services
        ├── CommService.java
        └── implementation
            ├── EmailService.java
            └── SMSService.java
```

## Setup
1. Clone the repository.
2. Ensure [Guice 7.0.0](https://mvnrepository.com/artifact/com.google.inject/guice/7.0.0) is added as a dependency in `pom.xml`:
   ```xml
   <dependency>
     <groupId>com.google.inject</groupId>
     <artifactId>guice</artifactId>
     <version>7.0.0</version>
   </dependency>
   ```
3. Build the project:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn exec:java -Dexec.mainClass="com.application.Main"
   ```
