package com.dhruv.server.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import com.dhruv.server.domain.Login;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class LoginControllerTestCases {

	@LocalServerPort
    int randomServerPort;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	
	// positive test case
	@Test
	public void loginShouldReturn200StatusCode() throws Exception {
		String baseURL = "http://localhost:" + randomServerPort + "/login";
		URI uri = new URI(baseURL);
		
		Login login = new Login("Varsha", "pass");
		HttpHeaders headers = new HttpHeaders();
 
        HttpEntity<Login> request = new HttpEntity<>(login, headers);
		
        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
        
	    //Verify request succeed
	    assertEquals(200, result.getStatusCodeValue());
    }
	
	// negative test case
	@Test
	@Description("Testing Negative case")
	public void loginShouldReturn401StatusCode() throws Exception {
		String baseURL = "http://localhost:" + randomServerPort + "/login";
		URI uri = new URI(baseURL);
		
		Login login = new Login("Varsha", "-------");
		HttpHeaders headers = new HttpHeaders();
 
        HttpEntity<Login> request = new HttpEntity<>(login, headers);
		
        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
        
	    //Verify request succeed
	    assertEquals(401, result.getStatusCodeValue());
    }	
}
