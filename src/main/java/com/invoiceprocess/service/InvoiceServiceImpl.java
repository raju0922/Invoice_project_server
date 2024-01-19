package com.invoiceprocess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceprocess.dao.InvoiceDao;
import com.invoiceprocess.model.Invoice;






@Service
public class InvoiceServiceImpl implements InvoiceService{
	
    @Autowired
	 InvoiceDao invoicedao;
    
	@Override
	public Invoice addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		invoicedao.save(invoice);
		return invoice;
	}

	@Override
	public List<Invoice> getInvoices() {
		// TODO Auto-generated method stub
		return invoicedao.findAll();
	}
	
 
	@Override
	public Invoice deleteInvoice(long id) {
		Invoice invoice = invoicedao.findById(id).get();
    	invoicedao.delete(invoice);
    	return invoice;
	}
}
