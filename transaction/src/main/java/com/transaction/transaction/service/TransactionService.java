package com.transaction.transaction.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.transaction.transaction.entity.InvChargeDetail;
import com.transaction.transaction.entity.TransactionEntity;
import com.transaction.transaction.repo.InvoiceRepository;
import com.transaction.transaction.repo.transactionRepo;

@Service
public class TransactionService {
	
	@Autowired
	private transactionRepo repo;
	
	@Autowired
	private InvoiceRepository invoiceRepo;

	public TransactionEntity makeTransaction(@RequestBody TransactionEntity req) {
	try {
		return repo.save(req);
		}catch(Exception e) {
			System.out.print(e);
			return null;
		}
		
	}
	
	public ResponseEntity<String> transactionMultipleList(@RequestBody List<TransactionEntity> transactions, List<InvChargeDetail> invoices) {
	try {
			repo.saveAll(transactions);
			invoiceRepo.saveAll(invoices);
			return new ResponseEntity<>(HttpStatus.CREATED .toString(), HttpStatus.OK);
			
		}catch(Exception e) {
			System.out.print(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public Optional<TransactionEntity> getTransactionDetails(@RequestBody TransactionEntity req) {
		Optional<TransactionEntity> isPresent = repo.findById(req.getId());
		if(isPresent.isPresent()) {
			return repo.findById(req.getId());
		}else {
			return null;
		}
		
	}
}
