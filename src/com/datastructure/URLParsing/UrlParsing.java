package com.datastructure.URLParsing;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


//import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;

public class UrlParsing {

    public void dataParsing(String urls) throws IOException, ParseException {

        String inline = "";
        URL url = new URL(urls);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responsecode = conn.getResponseCode();
        if (responsecode != 200)
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        else {
            Scanner sc = new Scanner(url.openStream());

            while (sc.hasNext()) {
                inline += sc.nextLine();
            }
            System.out.println("\nJSON data in string format");
            System.out.println(inline);
            sc.close();
        }

      //  JSONParser parse = new JSONParser();
        Object obj = new JSONParser().parse(inline);
        JSONObject jo = (JSONObject) obj;
        Long login = (Long)jo.get("id");
        // JSONObject jobj = (JSONObject) parse.parse(inline);
        //JSONObject jobj = new JSONObject();
        System.out.println("json objects");
        System.out.println(login);


    }
}
