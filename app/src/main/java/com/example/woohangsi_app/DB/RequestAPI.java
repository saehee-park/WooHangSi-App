package com.example.woohangsi_app.DB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class RequestAPI {
  String mainUrl;
  StringBuilder urlBuilder;
  URL url;
  HttpURLConnection conn;

  public RequestAPI() throws IOException {
    mainUrl = "https://hogs3d8gpa.execute-api.ap-southeast-2.amazonaws.com/dev";
  }

  public String requestPost(String subUrl, String bodyString) throws IOException {
    this.urlBuilder = new StringBuilder(mainUrl+subUrl);
    this.url = new URL(this.urlBuilder.toString());
    this.conn = (HttpURLConnection) url.openConnection();
    conn.setRequestProperty("Content-Type", "application/json");

    conn.setRequestMethod("POST");

    byte[] body = bodyString.getBytes();
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
  public String requestPut(String subUrl, String bodyString) throws IOException {
    this.urlBuilder = new StringBuilder(mainUrl+subUrl);
    this.url = new URL(this.urlBuilder.toString());
    this.conn = (HttpURLConnection) url.openConnection();
    conn.setRequestProperty("Content-Type", "application/json");

    conn.setRequestMethod("PUT");

    byte[] body = bodyString.getBytes();
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
  public String requestDelete(String subUrl, String bodyString) throws IOException {
    this.urlBuilder = new StringBuilder(mainUrl+subUrl);
    this.url = new URL(this.urlBuilder.toString());
    this.conn = (HttpURLConnection) url.openConnection();
    conn.setRequestProperty("Content-Type", "application/json");

    conn.setRequestMethod("DELETE");

    byte[] body = bodyString.getBytes();
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
