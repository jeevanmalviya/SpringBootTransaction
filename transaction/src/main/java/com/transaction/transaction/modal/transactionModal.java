package com.transaction.transaction.modal;

import java.util.List;

import com.transaction.transaction.entity.InvChargeDetail;
import com.transaction.transaction.entity.TransactionEntity;

public class transactionModal {

	private List<TransactionEntity> transactionlist; 
	private List<InvChargeDetail> invChargeDetail;
	
	public List<TransactionEntity> getTransactionlist() {
		return transactionlist;
	}
	public void setTransactionlist(List<TransactionEntity> transactionlist) {
		this.transactionlist = transactionlist;
	}
	public List<InvChargeDetail> getInvChargeDetail() {
		return invChargeDetail;
	}
	public void setInvChargeDetail(List<InvChargeDetail> invChargeDetail) {
		this.invChargeDetail = invChargeDetail;
	}
}