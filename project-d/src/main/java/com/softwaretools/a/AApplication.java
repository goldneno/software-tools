package com.softwaretools.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AApplication {
	@GetMapping("/")
	public String home() {
		return "This is my home page message for Project D.";
	}
	public static void main(String[] args) {
		SpringApplication.run(AApplication.class, args);
	}

}
