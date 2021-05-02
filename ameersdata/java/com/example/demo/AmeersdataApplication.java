package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@SpringBootApplication
public class AmeersdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmeersdataApplication.class, args);
	}

}



