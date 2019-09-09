package com.dhruv.server.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int customerId;
	private @NotNull int aadharId;
	private String voterId;
	
	private @NotNull String firstName;
	private @NotNull String middleName;
	private @NotNull String lastName;
	
	private String occupation;
	private String reference;
	
	
/*	private  Contact contact;
	private List<CoBorrower> coBorrowers;
	private List<Account> account;	
*/	
	
	
}
