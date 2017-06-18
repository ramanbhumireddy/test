package org.nsite.main;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nsite.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NsiteApplicationTests {

	//http://websystique.com/spring-boot/spring-boot-angularjs-spring-data-jpa-crud-app-example/
	@Autowired
	private TestRestTemplate restTemplate;
	

	//@Test
	public void contextLoads() {
		
	}

	@Test
	public void createClient() {
		
		Map<String, String> params = new HashMap<String, String>();
	    params.put("email", "ramanbhumireddy");
		
		ResponseEntity<String> responseEntity =	restTemplate.getForEntity("/getByEmail", String.class);
		assertNotNull(responseEntity.toString());
	}
	
	
}
