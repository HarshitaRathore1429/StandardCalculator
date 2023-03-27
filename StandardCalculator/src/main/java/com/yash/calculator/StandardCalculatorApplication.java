package com.yash.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StandardCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardCalculatorApplication.class, args);
	}

}
