package com.automobiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.automobiles")
@SpringBootApplication
public class AutomobilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomobilesApplication.class, args);
	}
	

}
