package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args) {
		System.out.println("welcome to spring");
		SpringApplication.run(CrudOperationApplication.class, args);
		System.out.println("the spring boot app is running successfully..!");
	}

}
