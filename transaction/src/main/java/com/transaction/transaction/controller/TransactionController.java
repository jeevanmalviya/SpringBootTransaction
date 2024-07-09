package com.transaction.transaction.controller;

import java.util.Optional;

import org.apache.catalina.authenticator.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.transaction.entity.TransactionEntity;
import com.transaction.transaction.modal.transactionModal;
import com.transaction.transaction.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService service;
	
	@PostMapping("/pay")
	public TransactionEntity makeTransaction(@RequestBody TransactionEntity req) {
		try {
			return service.makeTransaction(req);
		}catch(Exception e) {
			System.out.print(e);
			return null;
		}
		
	}

	@PostMapping("/getDetails")
	public Optional<TransactionEntity> getTransactionDetails(@RequestBody TransactionEntity req) {
		return service.getTransactionDetails(req);
	}
	
	@PostMapping("/transaction")
	public ResponseEntity<String> saveTransaction(@RequestBody transactionModal req){
	try {
		return service.transactionMultipleList(req.getTransactionlist() , req.getInvChargeDetail());
		}catch(Exception e) {
			System.out.print(e);
		}
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
