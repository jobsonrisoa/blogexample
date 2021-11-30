package com.spring.blogexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BlogexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogexampleApplication.class, args);
	}

}
