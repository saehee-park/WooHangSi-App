package com.example.woohangsi_app.DB;

public class User {
  String subUrl;
  // 사용자 등록
  public User() {
    subUrl = "/api/v1/user";
  }

  public String getSubUrl() {
    return subUrl;
  }
  public String getBody(int userID, String name) {
    return "{\n" +
            "      user_id: \""+userID+"\",\n" +
            "      name: \""+name+"\"\n" +
            "      }";
  }
}
