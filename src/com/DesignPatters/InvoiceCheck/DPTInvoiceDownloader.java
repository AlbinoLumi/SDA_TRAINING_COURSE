package com.DesignPatters.InvoiceCheck;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class DPTInvoiceDownloader implements InvoiceDownloader{
    @Override
    public String downloadInvoice(String iic, String createdDate, String tin) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("iic", iic)
                .addFormDataPart("dateTimeCreated", createdDate)
                .addFormDataPart("tin", tin)
                .build();
        Request request = new Request.Builder()
                .url("https://efiskalizimi-app.tatime.gov.al/invoice-check/api/verifyInvoice")
                .method("POST", body)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String invoiceData = response.body().string();
            String formatedInvoice = formatInvoice(invoiceData);
            System.out.println(formatedInvoice);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    }

    private String formatInvoice (String invoiceData) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = JsonParser.parseString(invoiceData);
        String formatedInvoice = gson.toJson(je);
        return formatedInvoice;
    }
}
