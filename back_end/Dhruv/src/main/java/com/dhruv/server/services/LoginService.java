package com.dhruv.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	@Autowired
	private Environment env;
	
	public boolean login(String userName, String password) {
		String masterUserName = env.getProperty("com.dhruv.server.user.admin.id");
		String masterUserPassword =  env.getProperty("com.dhruv.server.user.admin.password");
		boolean result = false;
		
		if(userName.equals(masterUserName) && password.equals(masterUserPassword))
			result = true;
		
		return result;
	}

}
