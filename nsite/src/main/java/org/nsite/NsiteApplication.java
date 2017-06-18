package org.nsite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.nsite")
public class NsiteApplication {

	private static Logger log = LoggerFactory.getLogger(NsiteApplication.class);
	
	protected NsiteApplication(){}

	public static void main(String[] args) {
		SpringApplication.run(NsiteApplication.class, args);
		log.info("NSite Started :) ");
	}
}
