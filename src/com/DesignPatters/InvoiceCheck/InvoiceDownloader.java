package com.DesignPatters.InvoiceCheck;

public interface InvoiceDownloader {
    public String downloadInvoice(String iic, String createdDate, String tin);
}
