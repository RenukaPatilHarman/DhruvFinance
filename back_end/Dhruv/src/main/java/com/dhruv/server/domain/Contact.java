package com.dhruv.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

	private int mobileNumber;
	private int optionalMobileNumber;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private int pincode;
}
