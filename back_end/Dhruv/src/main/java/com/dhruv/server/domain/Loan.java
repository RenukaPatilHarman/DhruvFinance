package com.dhruv.server.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

	private int loanId;
	private String loanPurpose;
	private int EMIDuration;
	
	private Double loanAmountApplied;
	private Double loanAmountApproved;
	private Double EMI;
	private Double EMIAmount;
	
	private LocalDate loanAppliedDate;
	private LocalDate loanApprovedDate;
	private LocalDate EMICollectionDate;
	
	
	
	
	
}
