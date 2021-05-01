package com.example.woohangsi_app.DB;

public class Brand {
  String subUrl, addUrl, budgetAddUrl, budgetUpdateUrl, budgetDeleteUrl, spendingAddUrl;
  public Brand() {
    subUrl = "/api/v1/brand";
    addUrl = "/api/v1/brand/add";
    budgetAddUrl = "/api/v1/brand/budget/add";
    budgetUpdateUrl = "/api/v1/brand/budget/update";
    budgetDeleteUrl = "/api/v1/brand/budget/delete";
    spendingAddUrl = "/api/v1/brand/spending/add";
  }

  public String getSubUrl() {
    return subUrl;
  }

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

  public String getSpendingAddUrl() {
    return spendingAddUrl;
  }

  public String getAddBody(String brandName, String categoryID) {
    return "{\n" +
            "    \"brand_name\": \""+brandName+"\",\n" +
            "    \"category_id\": \""+categoryID+"\"\n" +
            "  }";
  }

  public String getBudgetAddBody(int brandID, int userID, int budget, int spending) {
    return "{\n" +
            "    \"brand_id\": \""+brandID+"\",\n" +
            "    \"user_id\": \""+userID+"\",\n" +
            "    \"budget\": \""+budget+"\",\n" +
            "    \"spending\": \""+spending+"\"\n" +
            "  }";
  }

  public String getBudgetUpdateBody(int budget, int id) {
    return "{\n" +
            "    \"budget\": \""+budget+"\",\n" +
            "    \"id\": \""+id+"\"\n" +
            "  }";
  }

  public String getBudgetDeleteBody(int id) {
    return "{\n" +
            "    \"id\": \""+id+"\"\n" +
            "  }";
  }

  public String getSpendingAddBody(int spending, int id) {
    return "{\n" +
            "    \"spending\": \""+spending+"\",\n" +
            "    \"id\": \""+id+"\"\n" +
            "  }";
  }
}
