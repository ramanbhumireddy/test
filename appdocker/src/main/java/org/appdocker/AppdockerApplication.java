package org.appdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AppdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdockerApplication.class, args);
	}
	
	
	@GetMapping(value = "/")
	public String getMethodName() {
		return "test docker rest";
	}


}

