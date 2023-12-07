package com.invoiceProcessing.server.controller;

import com.invoiceProcessing.server.model.Invoice;
import com.invoiceProcessing.server.services.invoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class InvoiceController {

    @Autowired
    invoiceService invServ;
    @PostMapping("/invoice")
    public Invoice addInvoice(@RequestBody Invoice invoice){
        return this.invServ.addInvoice(invoice);
    }
    @GetMapping("/invoice")
    public List<Invoice> getInvoices(){
        return this.invServ.getInvoices();
    }
    @DeleteMapping("/invoice/{invoiceId}")
    public Invoice deleteInvoice(@PathVariable String invoiceId){
        return this.invServ.deleteInvoice(Long.parseLong(invoiceId));
    }
}
