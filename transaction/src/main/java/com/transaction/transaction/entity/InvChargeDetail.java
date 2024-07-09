package com.transaction.transaction.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inv_charge_details")
public class InvChargeDetail {
	
	@Id
	@GeneratedValue
	private int id;
	private String invoiceNum;
	private int chargeCode;
	private String charge_description;
	private int rate;
	private int unit;
	private Double amount;
	private String currency;
	private LocalDateTime created_at;
	private String created_by;
	
	
//	@OneToOne(cascade = CascadeType.ALL , mappedBy = "")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="fk_tran_id")
	private TransactionEntity transactionEntity;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	//	public TransactionEntity getTransactionId() {
//		return transactionId;
//	}
//	public void setTransactionId(TransactionEntity transactionId) {
//		this.transactionId = transactionId;
//	}
	public String getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public int getChargeCode() {
		return chargeCode;
	}
	public void setChargeCode(int chargeCode) {
		this.chargeCode = chargeCode;
	}
	public String getCharge_description() {
		return charge_description;
	}
	public void setCharge_description(String charge_description) {
		this.charge_description = charge_description;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	
	

}
