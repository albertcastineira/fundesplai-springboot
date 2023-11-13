package com.exercises.annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationsApplication.class, args);
		/*	Exercise 1
		* 	The difference between @Controller & @RestController is that the Controller is mainly use for MVC
		* 	and the RestController is used for building RESTful services.
		* */
	}
}
