package com.invoiceprocess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceprocess.model.Invoice;

import com.invoiceprocess.service.InvoiceService;



@RestController
@CrossOrigin
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceservice;
	
	@PostMapping("/invoice")
	 public Invoice addInvoice( @RequestBody Invoice invoice) {
		return this.invoiceservice.addInvoice(invoice);
		
	   }
	 @GetMapping("/invoice")
	 public List <Invoice> getInvoices(){
		 
		 return this.invoiceservice.getInvoices();
	 }
	 @DeleteMapping("/invoice/{invoiceid}")
	 public Invoice deleteInvoice(@PathVariable String invoiceid) {
		 return this.invoiceservice.deleteInvoice(Long.parseLong(invoiceid));
		 
	 }
}