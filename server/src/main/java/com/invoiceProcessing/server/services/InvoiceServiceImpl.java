package com.invoiceProcessing.server.services;

import com.invoiceProcessing.server.dao.InvoiceDao;
import com.invoiceProcessing.server.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements invoiceService{

    @Autowired
    InvoiceDao invoiceDao;
    @Override
    public Invoice addInvoice(Invoice invoice) {
        invoiceDao.save(invoice);
        return invoice;
    }

    @Override
    public List<Invoice> getInvoices() {
        return invoiceDao.findAll();
    }

    @Override
    public Invoice deleteInvoice(long id) {
        Invoice invoice = invoiceDao.findById(id).get();
        invoiceDao.delete(invoice);
        return invoice;
    }
}
