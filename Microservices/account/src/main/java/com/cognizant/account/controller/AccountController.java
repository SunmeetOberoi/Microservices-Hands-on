package com.cognizant.account.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("/accounts/{number}")
	public ResponseEntity<String> getDetails(@PathVariable("number") String accNo){
		String response = "{ number: \"00987987973432\", type: \"savings\", balance: 234343 }";
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
