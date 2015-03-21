# swagger-spring-boot-example
An example project to show usage Swagger with Spring Boot

### Background
I have been using Swagger to document API in Spring project and it worked pretty well, however, I am still having trouble to make it seamlessly work with Spring Boot. Following the [discussion over stackoverflow](http://stackoverflow.com/questions/27861872/unable-to-get-swagger-ui-working-with-spring-boot), I am creating a sample project hopefully to show how it works. Please refer  [Swagger-SpringMVC-Demo](https://github.com/adrianbk/swagger-springmvc-demo) for more information.


### How to run
```
1. mvn spring-boot:run
2. open http://localhost:8080/sdoc.jsp

```

![User Document](src/images/swagger-ui.png?raw=true "Swagger")

### NOTE
It only works with Tomcat. If we switch to Jetty, the Swagger-UI is not loaded.

### To make it work with Jetty
Due to [Spring Boot limitation on JSP for embedded container](http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-web-applications.html), swagger-ui cannot be used as jar directly. To make it work with Jetty, I have to go for static contents.

```
1. Remove swagger-spring-mvc-ui from pom.xml
2. Download swagger-ui from https://github.com/swagger-api/swagger-ui.git
3. Copy the 'dist' directory to folders under resources (I placed under src/main/resources/public)
4. Edit index.html,  url = "http://petstore.swagger.io/v2/swagger.json"; 
                ===> url = "http://localhost:8080/api-docs"
5. mvn spring-boot:run
6. open: http://localhost:8080/index.html
```
