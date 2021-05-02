package com.example.woohangsi_app.DB;

public class Account {
  String subUrl, getAllAccountUrl, getTransactionsUrl;
  public Account() {
    subUrl = "/api/v1/account";
    // 사용자 모든 계좌 조회
    getAllAccountUrl = "/api/v1/account/getAllAccount";
    // 계좌 내역 조회
    getTransactionsUrl = "/api/v1/account/getTransactions";
  }

  public String getSubUrl() {
    return subUrl;
  }

  public String getGetAllAccountUrl() {
    return getAllAccountUrl;
  }

  public String getGetTransactionsUrl() {
    return getTransactionsUrl;
  }

  public String getGetAllAccountBody(String userID) {
    return "{\n" +
            "    \"user_id\": \""+userID+"\"\n" +
            "  }";
  }

  public String getGetTransactionsBody(String acno) {
    return "{\n" +
            "    \"acno\": \""+acno+"\"\n" +
            "  }";
  }
}
