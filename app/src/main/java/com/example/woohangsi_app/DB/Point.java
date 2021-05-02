package com.example.woohangsi_app.DB;

public class Point {
  String subUrl, manageUrl, rootUrl, listUrl;

  public Point() {
    subUrl = "/api/v1/point";

    // 총 포인트 조회
    rootUrl = "/api/v1/point/";
    // 포인트 적립/차감
    manageUrl = "/api/v1/point/manage";
    // 포인트 내역 조회
    listUrl = "/api/v1/point/list";
  }

  public String getSubUrl() {
    return subUrl;
  }

  public String getManageUrl() {
    return manageUrl;
  }

  public String getRootUrl() {
    return rootUrl;
  }

  public String getListUrl() {
    return listUrl;
  }

  public String getRootBody(int userID) {
    return "{\n" +
            "      \"user_id\": \""+userID+"\"\n" +
            "    }";
  }

  public String getManageBody( int pointAmount, String pointContent, int userID) {
    return "{\n" +
//            "      \"point_id\": \""+pointID+"\",\n" +
            "      \"point_amount\": \""+pointAmount+"\",\n" +
            "      \"point_content\": \""+pointContent+"\",\n" +
            "      \"user_id\": \""+userID+"\"\n" +
            "    }";
  }

  public String getListBody(int userID) {
    return "{\n" +
            "      \"user_id\": \""+userID+"\"\n" +
            "    }";
  }


}
