package com.gmail.wguo1990;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
public class Application 
{
	 public static void main(String[] args) {
	        new SpringApplicationBuilder(Application.class).web(true).run(args);
	 }
}
