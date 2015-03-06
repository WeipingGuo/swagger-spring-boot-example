package com.gmail.wguo1990.configs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;


@Configuration
@EnableWebMvc
@EnableSwagger
@ComponentScan("com.gmail.wguo1990.web.controllers, com.gmail.wguo1990.models")
public class SwaggerConfig extends WebMvcConfigurerAdapter{
	
	private SpringSwaggerConfig springSwaggerConfig;

	   @Autowired
	   public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
	      this.springSwaggerConfig = springSwaggerConfig;
	   }

	   @Bean 
	   public SwaggerSpringMvcPlugin customImplementation(){
	      return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
	            .apiInfo(apiInfo())
	            .includePatterns(".*users.*");
	   }

	    private ApiInfo apiInfo() {
	      ApiInfo apiInfo = new ApiInfo(
	              "My Apps API Title",
	              "My Apps API Description",
	              "My Apps API terms of service",
	              "My Apps API Contact Email",
	              "My Apps API Licence Type",
	              "My Apps API License URL"
	        );
	      return apiInfo;
	    }
	    
	    @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	      configurer.enable();
	    }

}
