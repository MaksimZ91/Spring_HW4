package com.example.Spring_HW4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan("com.example.Spring_HW4.models")
@SpringBootApplication
public class SpringHw4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringHw4Application.class, args);
	}

}
