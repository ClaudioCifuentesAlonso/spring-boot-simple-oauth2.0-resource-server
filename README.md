# spring-boot-simple-oauth2.0-resource-server
Demo project for Spring Boot and OAuth 2.0 Resource Server


## Usage

This application uses the following OAuth2.0 dependency to run as Resource Server:

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
</dependency>
```

This application has a couple of extra dependencies:
1. This application communicates with a Keycloak Authorization server, here are the instructions to configure it [Keycloak configuration]().
2. This application is configured as eureka client so, Eureka server must be running on port 8010 here is the [Eureka service discovery repository](https://github.com/ClaudioCifuentesAlonso/oauth2.0-eureka-discovery-service.git).

To run this application:

```
mvn spring-boot:run
```