package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloHeroukApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHeroukApplication.class, args);
		System.out.println("Welcome to Boot and Herouk project. Have a nice day!!");
	}

}
