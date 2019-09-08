package com.dhruv.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private int accountNo;
	private String accHolderName;
	private String bankName;
	// Check photo
}
