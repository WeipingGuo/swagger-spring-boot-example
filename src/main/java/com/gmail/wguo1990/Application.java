package com.gmail.wguo1990;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;


@Configuration
@EnableAutoConfiguration
@EnableSwagger
@ComponentScan(basePackages = {"com.gmail.wguo1990"})
public class Application 
{
	 @Autowired
	 private SpringSwaggerConfig swaggerConfig;
	 
	 public static void main(String[] args) {
	        new SpringApplicationBuilder(Application.class).web(true).run(args);
	 }
	 
	 @Bean
	 public SwaggerSpringMvcPlugin groupOnePlugin() {
		 return new SwaggerSpringMvcPlugin(swaggerConfig).
				 apiInfo(apiInfo()).
				 includePatterns("/users.*?").
				 swaggerGroup("admin");
	 }
	 
	 private ApiInfo apiInfo() {
		 ApiInfo apiInfo = new ApiInfo(
				 "Swagger With Spring Boot",
				 "A test application to demonstrate Swagger working with Spring Boot",
				 "Free to use and mess around",
				 "wguo1990@gmail.com",
				 "Open Licence",
				 "wguo1990@gmail.com"
		 );
		 return apiInfo;
	 }
}
