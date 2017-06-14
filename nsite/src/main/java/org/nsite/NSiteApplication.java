package org.nsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NSiteApplication {
	
	protected NSiteApplication(){}

	public static void main(String[] args) {
		SpringApplication.run(NSiteApplication.class, args);
	}
}
