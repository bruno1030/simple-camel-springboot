package com.bruno.simplecamelspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCamelSpringbootApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SimpleCamelSpringbootApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
