package com.example.woohangsi_app.requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CallAPI {
  String subUrl, bodyString;

  public CallAPI(String subUrl, String bodyString) {
    this.subUrl = subUrl;
    this.bodyString = bodyString;
  }

  public String call() throws IOException {
    StringBuilder urlBuilder = new StringBuilder("https://openapi.wooribank.com:444"+this.subUrl);
    URL url = new URL(urlBuilder.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("POST");

    conn.setRequestProperty("appKey", "l7xxkKhWS0DSuluIuNUdM55o81TXXsYU08o1");
    conn.setRequestProperty("Content-Type", "application/json");

    byte[] body = this.bodyString.getBytes();
    conn.setFixedLengthStreamingMode(body.length);
    conn.setDoOutput(true);

    OutputStream out = conn.getOutputStream();
    out.write(body);
    System.out.println("Response code: " + conn.getResponseCode());
    BufferedReader rd;
    if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
      rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    StringBuilder sb = new StringBuilder();
    String line;
    while ((line = rd.readLine()) != null) {
      sb.append(line);
    }
    rd.close();
    conn.disconnect();
    System.out.println(sb.toString());
    return sb.toString();
  }

}
