package com.example.woohangsi_app.requests;

public class Urls {
  private String getCellCerti, executeCellCerti, getIndivAllAccInfo, getAccBasicInfo, getAccTransList;

  public Urls() {
    this.getIndivAllAccInfo = "/oai/wb/v1/finance/getIndivAllAccInfo";
    this.getAccBasicInfo = "/oai/wb/v1/finance/getAccBasicInfo";
    this.getAccTransList = "/oai/wb/v1/finance/getAccTransList";
    this.getCellCerti =  "/oai/wb/v1/login/getCellCerti";
    this.executeCellCerti = "/oai/wb/v1/login/executeCellCerti";
  }

  public String getGetCellCerti() {
    return getCellCerti;
  }

  public String getExecuteCellCerti() {
    return executeCellCerti;
  }

  public String getGetIndivAllAccInfo() {
    return getIndivAllAccInfo;
  }

  public String getGetAccBasicInfo() {
    return getAccBasicInfo;
  }

  public String getGetAccTransList() {
    return getAccTransList;
  }
}
