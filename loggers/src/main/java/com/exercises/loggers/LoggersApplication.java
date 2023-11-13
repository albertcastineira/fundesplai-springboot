package com.exercises.loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggersApplication {

	private static final Logger logger = LoggerFactory.getLogger(LoggersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggersApplication.class, args);
		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Warning message");
		logger.error("Error message");
	}

}
