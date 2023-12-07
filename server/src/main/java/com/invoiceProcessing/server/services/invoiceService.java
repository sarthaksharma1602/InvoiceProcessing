package com.invoiceProcessing.server.services;

import com.invoiceProcessing.server.model.Invoice;

import java.util.List;

public interface invoiceService {
    public Invoice addInvoice(Invoice invoice);

    public List<Invoice> getInvoices();

    public Invoice deleteInvoice(long id);
}
