package com.dhruv.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhruv.server.domain.Login;
import com.dhruv.server.services.LoginService;

@RestController
@RequestMapping(path = "/login")
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping()
	public String test() {
		return "Success";
	}
	
	@PostMapping()
	public ResponseEntity<?> login(@RequestBody Login login) {

		if (loginService.login(login.getUserName(), login.getPassword()))
			return new ResponseEntity<>(null, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);

	}
}
