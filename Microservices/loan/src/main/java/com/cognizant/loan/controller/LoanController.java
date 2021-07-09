package com.cognizant.loan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

	@GetMapping("/loans/{number}")
	public ResponseEntity<String> getDetails(@PathVariable("number") String loanNo){
		String response = "{ number: \"H00987987972342\", type: \"car\", loan: 400000, emi: 3258, tenure: 18 }";
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}