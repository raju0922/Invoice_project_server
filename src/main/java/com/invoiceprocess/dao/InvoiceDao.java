package com.invoiceprocess.dao;


	import org.springframework.data.jpa.repository.JpaRepository;


	import com.invoiceprocess.model.Invoice;


	public interface InvoiceDao extends JpaRepository<Invoice, Long>{

	}


