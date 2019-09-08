package com.dhruv.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoBorrower {

	private int coBorrowerId;
	private int aadharId;
	private String voterId;
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	private String occupation;
	private Contact contact;
	
	
}
