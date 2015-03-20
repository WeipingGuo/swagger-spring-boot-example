# swagger-spring-boot-example
An example project to show usage Swagger with Spring Boot

### Background
I have been using Swagger to document API in Spring project and it worked pretty well, however, I am still having trouble to make it seamlessly work with Spring Boot. Following the [discussion over stackoverflow](http://stackoverflow.com/questions/27861872/unable-to-get-swagger-ui-working-with-spring-boot), I am creating a sample project hopefully to show how it works.


### How to run
```
1. mvn spring-boot:run
2. open http://localhost:8080/sdoc.jsp

```

![User Document](/images/swagger-ui.png?raw=true "Optional Title")

### NOTE
It only works with Tomcat. If we switch to Jetty, the Swagger-UI is not loaded.


