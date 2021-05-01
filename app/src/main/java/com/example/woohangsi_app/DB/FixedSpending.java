package com.example.woohangsi_app.DB;

public class FixedSpending {
  String subUrl, rootUrl, addUrl, updateUrl, deleteUrl;

  public FixedSpending() {
    this.subUrl = "/api/v1/fixed_spending";
    this.rootUrl = "/api/v1/fixed_spending/";
    this.addUrl = "/api/v1/fixed_spending/add";
    this.updateUrl = "/api/v1/fixed_spending/update";
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


  public String getRootBody(int userID) {
    return "{\n" +
            "    \"user_id\": \""+userID+"\"\n" +
            "  }";
  }

  public String getAddBody(String fixedContent, int fixedAmount, int userID) {
    return "{\n" +
            "    \"fixed_content\": \""+fixedContent+"\",\n" +
            "    \"fixed_amount\": \""+fixedAmount+"\",\n" +
            "    \"user_id\": \""+userID+"\"\n" +
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
