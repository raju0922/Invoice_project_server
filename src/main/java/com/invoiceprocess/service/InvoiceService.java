package com.invoiceprocess.service;

import java.util.List;

import com.invoiceprocess.model.Invoice;

public interface InvoiceService {
	public Invoice addInvoice(Invoice invoice);
	
	public List <Invoice> getInvoices();

	

	public Invoice deleteInvoice(long id);

}
