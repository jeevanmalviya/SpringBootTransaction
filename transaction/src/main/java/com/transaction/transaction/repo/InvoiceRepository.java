package com.transaction.transaction.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.transaction.entity.InvChargeDetail;

public interface InvoiceRepository  extends JpaRepository<InvChargeDetail, Integer>  {

}
