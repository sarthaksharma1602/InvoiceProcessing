package com.invoiceProcessing.server.dao;

import com.invoiceProcessing.server.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice,Long> {


}
