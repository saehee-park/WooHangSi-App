package com.example.woohangsi_app.DB;

public class Category {
  String subUrl, rootUrl,  budgetAddUrl, budgetUpdateUrl, budgetDeleteUrl, spendingUpdateUrl;
  public Category() {
    subUrl = "/api/v1/category";

    // 설정한 카테고리 예산 조회
    rootUrl = "/api/v1/category/";
    // 카테고리 예산 추가
    budgetAddUrl = "/api/v1/category/budget/add";
    // 카테고리 예산 수정
    budgetUpdateUrl = "/api/v1/category/budget/update";
    // 카테고리 예산 삭제
    budgetDeleteUrl = "/api/v1/category/budget/delete";
    // 카테고리 지출 추가
    spendingUpdateUrl = "/api/v1/category/spending/update";
  }

  public String getSubUrl() {
    return subUrl;
  }

  public String getRootUrl() {
    return rootUrl;
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

  public String getRootBody(int userID, String categoryID, String month) {
    return "{\n" +
            "    \"user_id\": \""+userID+"\",\n" +
            "    \"category_id\": \""+categoryID+"\",\n" +
            "    \"month\": \""+month+"\"\n" +
            "  }";
  }


  public String getBudgetAddBody(int budget, int userID, String categoryID, String month) {
    return "{\n" +
            "    \"budget\": \""+budget+"\",\n" +
            "    \"user_id\": \""+userID+"\",\n" +
            "    \"category_id\": \""+categoryID+"\",\n" +
            "    \"month\": \""+month+"\"\n" +
            "  }";
  }

  public String getBudgetUpdateBody(int budget, int id) {
    return "{\n" +
            "      \"budget\": \""+budget+"\",\n" +
            "      \"id\": \""+id+"\"\n" +
            "    }";
  }

  public String getBudgetDeleteBody(int id) {
    return "{\n" +
            "      \"id\": \""+id+"\"\n" +
            "    }";
  }

  public String getSpendingUpdateBody(String spending, String id) {
    return "{\n" +
            "    \"spending\": \""+spending+"\",\n" +
            "    \"id\": \""+id+"\"\n" +
            "  }";
  }
}
