package org.example;

import com.google.gson.Gson;

import javax.mail.MessagingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;

public class Main
{
    public static void main(String[] args) throws MessagingException, GeneralSecurityException, IOException
    {
        EbayAnalysis analysis = new EbayAnalysis();
        CompletedItemsResponse response = analysis.getCompletedItems("https://svcs.ebay.com/services/search/FindingService/v1?OPERATION-NAME=findItemsByKeywords&SERVICE-VERSION=1.0.0&SECURITY-APPNAME=MarcusYi-SoldAn-PRD-19c25bdb8-2531162c&RESPONSE-DATA-FORMAT=JSON&REST-PAYLOAD&keywords=RTX+3090");

        Gson gson = new Gson();
        PrimaryCategory item = gson.fromJson("{\"categoryId\":[\"27386\"],\"categoryName\":[\"Graphics\\/Video Cards\"]}", PrimaryCategory.class);
        System.out.println(item.getCategoryName()[0]);
    }
}
