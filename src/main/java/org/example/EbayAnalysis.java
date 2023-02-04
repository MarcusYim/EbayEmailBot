package org.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EbayAnalysis
{
    public CompletedItemsResponse getCompletedItems(String address)
    {
        try
        {
            //https://svcs.ebay.com/services/search/FindingService/v1?OPERATION-NAME=findItemsByKeywords&SERVICE-VERSION=1.0.0&SECURITY-APPNAME=MarcusYi-SoldAn-PRD-19c25bdb8-2531162c&RESPONSE-DATA-FORMAT=JSON&REST-PAYLOAD&keywords=RTX+3090
            URL url = new URL(address);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            StringBuilder result = new StringBuilder();
            for (String line; (line = reader.readLine()) != null; )
            {
                result.append(line);
            }

            Gson gson = new Gson();
            return gson.fromJson(result.toString(), CompletedItemsResponse.class);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;
    }
}
