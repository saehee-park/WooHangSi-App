package com.example.woohangsi_app.DB;

public class FixedSpending {
  String subUrl, rootUrl, addUrl, updateUrl, deleteUrl;

  public FixedSpending() {
    this.subUrl = "/api/v1/fixed_spending";

    // 설정한 고정 지출 조회
    this.rootUrl = "/api/v1/fixed_spending/";
    // 고정 지출 추가
    this.addUrl = "/api/v1/fixed_spending/add";
    // 고정 지출 수정
    this.updateUrl = "/api/v1/fixed_spending/update";
    // 고정 지출 삭제
    this.deleteUrl = "/api/v1/fixed_spending/delete";
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

  public String getAddBody(String fixedContent, int fixedAmount, int userID, String month) {
    return "{\n" +
            "    \"fixed_content\": \""+fixedContent+"\", \n" +
            "    \"fixed_amount\": \""+fixedAmount+"\", \n" +
            "    \"user_id\": \""+userID+"\", \n" +
            "    \"month\": \""+month+"\" \n" +
            "  }";
  }

  public String getUpdateBody(String fixedContent, int fixedAmount, int fixedSpendingID) {
    return "{\n" +
            "    \"fixed_content\": \""+fixedContent+"\",\n" +
            "    \"fixed_amount\": \""+fixedAmount+"\",\n" +
            "    \"fixed_spending_id\": \""+fixedSpendingID+"\"\n" +
            "  }";
  }

  public String getDeleteBody(int fixedSpendingID) {
    return "{\n" +
            "    \"fixed_spending_id\": \""+fixedSpendingID+"\"\n" +
            "  }";
  }
}
