package com.example.woohangsi_app.DB;

public class Category {
  String subUrl, rootUrl,  budgetAddUrl, budgetUpdateUrl, budgetDeleteUrl, spendingAddUrl;
  public Category() {
    subUrl = "/api/v1/category";
    rootUrl = "/api/v1/category/";
    budgetAddUrl = "/api/v1/category/budget/add";
    budgetUpdateUrl = "/api/v1/category/budget/update";
    budgetDeleteUrl = "/api/v1/category/budget/delete";
    spendingAddUrl = "/api/v1/category/spending/add";
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

  public String getSpendingAddUrl() {
    return spendingAddUrl;
  }

  public String getRootBody(int userID, String categoryID) {
    return "{\n" +
            "    \"user_id\": \""+userID+"\",\n" +
            "    \"category_id\": \""+categoryID+"\"\n" +
            "  }";
  }


  public String getBudgetAddBody(int budget, int userID, String categoryID) {
    return "{\n" +
            "      \"budget\": \""+budget+"\",\n" +
            "      \"user_id\": \""+userID+"\",\n" +
            "      \"category_id\": \""+categoryID+"\"\n" +
            "    }";
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

  public String getSpendingAddBody(int spending, int id) {
    return "{\n" +
            "      \"spending\": \""+spending+"\",\n" +
            "      \"id\": \""+id+"\"\n" +
            "    }";
  }
}
