package org.nsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NsiteApplication {
	
	protected NsiteApplication(){}

	public static void main(String[] args) {
		SpringApplication.run(NsiteApplication.class, args);
	}
}
