package com.DesignPatters.InvoiceCheck;

import java.util.HashMap;

public class ProxyDownloader implements InvoiceDownloader{
    InvoiceDownloader invoiceDownloader;
    HashMap<String, String> invoiceCache = new HashMap<String, String>();

    public ProxyDownloader(InvoiceDownloader invoiceDownloader){
        this.invoiceDownloader = invoiceDownloader;
    }
    @Override
    public String downloadInvoice(String iic, String createdDate, String tin) {
        String fatura = "";

        if (invoiceCache.keySet().contains(iic)) {
            fatura = invoiceCache.get(iic);
            return fatura;

        }
          fatura = this.invoiceDownloader.downloadInvoice(iic, createdDate, tin);
            this.invoiceCache.put(iic, fatura);
            return fatura;

        }

    }


