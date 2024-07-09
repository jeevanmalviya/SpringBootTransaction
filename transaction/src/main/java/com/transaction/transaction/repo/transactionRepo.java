package com.transaction.transaction.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.transaction.entity.InvChargeDetail;
import com.transaction.transaction.entity.TransactionEntity;

public interface transactionRepo extends JpaRepository<TransactionEntity, Integer> {

}
