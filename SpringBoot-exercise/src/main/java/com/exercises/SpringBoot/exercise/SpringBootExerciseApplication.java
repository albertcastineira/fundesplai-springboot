package com.exercises.SpringBoot.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExerciseApplication.class, args);

		/* 	Answers:
		* 	1: To execute a file from the terminal we should go to the project root path and execute:
		* 	java -jar PROJECT_NAME.jar
		*
		* 	2: To check dependencies we have to go to the pom.xml file on the src folder. Once in we
		* 	look for a xml tag called dependencies, inside it we will see all of them.
		* */
	}

}
