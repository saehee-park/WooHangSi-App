package com.example.woohangsi_app.DB;

public class Entire {
  String subUrl, rootUrl, addUrl, updateUrl, deleteUrl;
  public Entire() {
    subUrl = "/api/v1/entire";

    // 전체 예산/지출 조회
    rootUrl = "/api/v1/entire/";
    // 전체 예산 추가
    addUrl = "/api/v1/entire/add";
    // 전체 예산 수정
    updateUrl = "/api/v1/entire/update";
    // 전체 예산 삭제
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

  public String getRootBody(int userID, String month) {
    return "{\n" +
            "    \"user_id\": \""+userID+"\", \n" +
            "    \"month\": \""+month+"\" \n" +
            "  }";
  }

  public String getAddBody(int budget, int userID, String month) {
    return "{\n" +
            "    \"budget\": \""+budget+"\",\n" +
            "    \"user_id\": \""+userID+"\",\n" +
            "    \"month\": \""+month+"\"\n" +
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
            "    \"entire_id\": \""+entireID+"\" \n" +
            "  }";
  }
}
