package com.DesignPatters.InvoiceCheck;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {

        InvoiceDownloader realdownloader = new DPTInvoiceDownloader();
        InvoiceDownloader proxydownloader = new ProxyDownloader(realdownloader);

        long startTime = System.currentTimeMillis();



       for(int i = 0; i < 10; i++){
           String fatura = proxydownloader.downloadInvoice("67B2E3AD6DB1BEA5E9C220B88B4D3422", "2022-09-25T10:50:46 02:00", "L07004002P");
           System.out.println(fatura);
       }
        long endTime = System.currentTimeMillis();
        long diff = (endTime - startTime);
        System.out.println("Koha qe kaloj ne milisekonda eshte: "+ diff);

    }
}
