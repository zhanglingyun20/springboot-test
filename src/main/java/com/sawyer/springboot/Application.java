package com.sawyer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(Application.class, args);
		UserProperties userProperties = context.getBean(UserProperties.class);
		System.out.println(userProperties);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(Application.class);
	}
}
