package com.example.woohangsi_app.DB;

public class Entire {
  String subUrl, rootUrl, addUrl, updateUrl, deleteUrl;
  public Entire() {
    subUrl = "/api/v1/entire";
    rootUrl = "/api/v1/entire/";
    addUrl = "/api/v1/entire/add";
    updateUrl = "/api/v1/entire/update";
    deleteUrl = "/api/v1/entire/delete";
  }

  public String getSubUrl() {
    return subUrl;
  }

  public String getRootUrl() {
    return rootUrl;
  }

  public String getAddUrl() {
    return addUrl;
  }

  public String getUpdateUrl() {
    return updateUrl;
  }

  public String getDeleteUrl() {
    return deleteUrl;
  }

  public String getRootBody(int userID) {
    return "{\n" +
            "    \"user_id\": \""+userID+"\" \n" +
            "  }";
  }

  public String getAddBody(int budget, int userID) {
    return "{\n" +
            "    \"budget\": \""+budget+"\", \n" +
            "    \"user_id\": \""+userID+"\" \n" +
            "  }";
  }

  public String getUpdateBody(int budget, int entireID) {
    return "{\n" +
            "    \"budget\": \""+budget+"\", \n" +
            "    \"entire_id\": \""+entireID+"\" \n" +
            "  }";
  }

  public String getDeleteBody(int entireID) {
    return "{\n" +
            "    \"entire_id\": \"\" \n" +
            "  }";
  }
}
