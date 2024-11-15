package com.pragma.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Practica2BatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practica2BatchApplication.class, args);
	}

}
