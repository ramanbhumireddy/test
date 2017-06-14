package org.nsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.nsite")
public class NsiteApplication {
	
	protected NsiteApplication(){}

	public static void main(String[] args) {
		SpringApplication.run(NsiteApplication.class, args);
	}
}
