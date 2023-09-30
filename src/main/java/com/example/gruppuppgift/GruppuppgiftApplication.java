package com.example.gruppuppgift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GruppuppgiftApplication {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		SpringApplication.run(Controller.class, args);

	}

}
