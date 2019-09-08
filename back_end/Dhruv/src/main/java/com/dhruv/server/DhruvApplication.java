package com.dhruv.server;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dhruv.server.domain.Login;

@SpringBootApplication
public class DhruvApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(DhruvApplication.class, args);
		
	}

	// code to execute at startup of the project
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// test create login object
		Login login = new Login();
		login.setUserName("Mahesh");
		login.setPassword("pass");
		System.out.println(login);
	}

}
