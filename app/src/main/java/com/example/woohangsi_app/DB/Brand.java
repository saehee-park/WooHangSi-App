package com.example.woohangsi_app.DB;

public class Brand {
  String subUrl, rootUrl, addUrl, budgetAddUrl, budgetUpdateUrl, budgetDeleteUrl, spendingUpdateUrl;
  public Brand() {
    subUrl = "/api/v1/brand";

    // 브랜드 예산 조회
    rootUrl = "/api/v1/brand/";
    // 브랜드 추가
    addUrl = "/api/v1/brand/add";
    // 브랜드 예산 추가
    budgetAddUrl = "/api/v1/brand/budget/add";
    // 브랜드 예산 수정
    budgetUpdateUrl = "/api/v1/brand/budget/update";
    // 브랜드 예산 삭제
    budgetDeleteUrl = "/api/v1/brand/budget/delete";
    // 브랜드 지출 추가
    spendingUpdateUrl = "/api/v1/brand/spending/update";
  }

  public String getSubUrl() {
    return subUrl;
  }

  public String getRootUrl() {return rootUrl;}

  public String getAddUrl() {
    return addUrl;
  }

  public String getBudgetAddUrl() {
    return budgetAddUrl;
  }

  public String getBudgetUpdateUrl() {
    return budgetUpdateUrl;
  }

  public String getBudgetDeleteUrl() {
    return budgetDeleteUrl;
  }

  public String getSpendingUpdateUrl() {
    return spendingUpdateUrl;
  }

  public String getRootBody(String userID, String brandID, String month) {
    return "{\n" +
            "    \"user_id\": \""+userID+"\",\n" +
            "    \"brand_id\": \""+brandID+"\",\n" +
            "    \"month\": \""+month+"\"\n" +
            "  }";
  }

  public String getAddBody(String brandName, String categoryID) {
    return "{\n" +
            "    \"brand_name\": \""+brandName+"\",\n" +
            "    \"category_id\": \""+categoryID+"\"\n" +
            "  }";
  }

  public String getBudgetAddBody(String brandID, String userID, String budget, String spending, String month) {
    return "{\n" +
            "    \"brand_id\": \""+brandID+"\",\n" +
            "    \"user_id\": \""+userID+"\",\n" +
            "    \"budget\": \""+budget+"\",\n" +
            "    \"spending\": \""+spending+"\",\n" +
            "    \"month\": \""+month+"\"\n" +
            "  }";
  }

  public String getBudgetUpdateBody(String budget, String id) {
    return "{\n" +
            "    \"budget\": \""+budget+"\",\n" +
            "    \"id\": \""+id+"\"\n" +
            "  }";
  }

  public String getBudgetDeleteBody(String id) {
    return "{\n" +
            "    \"id\": \""+id+"\"\n" +
            "  }";
  }

  public String getSpendingUpdateBody(String spending, String id) {
    return "{\n" +
            "    \"spending\": \""+spending+"\",\n" +
            "    \"id\": \""+id+"\"\n" +
            "  }";
  }
}
