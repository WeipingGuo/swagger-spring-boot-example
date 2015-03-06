# swagger-spring-boot-example
An example project to show usage Swagger with Spring Boot

### Background
I have been using Swagger to document API in Spring project and it worked pretty well, however, I am still having trouble to make it seamlessly work with Spring Boot. Following the [discussion over stackoverflow](http://stackoverflow.com/questions/27861872/unable-to-get-swagger-ui-working-with-spring-boot), I am creating a sample project hopefully to show how it works.

The Swagger-UI is successfully launched for the initial commit by http://localhost:8080/sdoc.jsp, unfortunately retrieval of API docs have some errors (Can't read swagger JSON from http://localhost:8080/api-docs). For now, I am switching to [JSONDoc](http://jsondoc.org/) simply because it works well with Spring boot. 

### How to run
```
1. mvn spring-boot:run
2. open http://localhost:8080/sdoc.jsp

```

### NOTE
It only works with Tomcat. If we switch to Jetty, the Swagger-UI is not loaded.


