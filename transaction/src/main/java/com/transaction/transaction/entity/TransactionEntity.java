package com.transaction.transaction.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="transaction_tbl")
public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Double amount;
	@Column(nullable = false)
	private int transactionId;
	private LocalDateTime created_at;
	private String created_by;
	private String currency;
	private LocalDateTime transaction_date;
	private String hash;
	private String partner_txn_id;
	private String scb_txn_id;
   @Column(nullable = false)
	private String status;
	private LocalDateTime updated_at;
	private String updated_by;
	private String email;
	private String inv_seq_no;
	private String invoiceNum;
	private int chargeCode;
	private String charge_description;
	private int rate;
	private int unit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public LocalDateTime getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(LocalDateTime transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getPartner_txn_id() {
		return partner_txn_id;
	}
	public void setPartner_txn_id(String partner_txn_id) {
		this.partner_txn_id = partner_txn_id;
	}
	public String getScb_txn_id() {
		return scb_txn_id;
	}
	public void setScb_txn_id(String scb_txn_id) {
		this.scb_txn_id = scb_txn_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInv_seq_no() {
		return inv_seq_no;
	}
	public void setInv_seq_no(String inv_seq_no) {
		this.inv_seq_no = inv_seq_no;
	}
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
	
	
	
	
	
	
}
