package com.bolsadeideas.springboot.backned.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendApirestApplication {

	public static final String angularOrigin = "http://localhost:4200";
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApirestApplication.class, args);
	}

}

