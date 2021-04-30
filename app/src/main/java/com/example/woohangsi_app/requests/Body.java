package com.example.woohangsi_app.requests;

public class Body {
  private String getCellCerti, executeCellCerti, getIndivAllAccInfo, getAccBasicInfo, getAccTransList;

  public Body() {
    this.getIndivAllAccInfo = "{\"dataHeader\": {\"UTZPE_CNCT_IPAD\": \"\",\"UTZPE_CNCT_MCHR_UNQ_ID\": \"\",\"UTZPE_CNCT_TEL_NO_TXT\": \"\",\"UTZPE_CNCT_MCHR_IDF_SRNO\": \"\",\"UTZ_MCHR_OS_DSCD\": \"\",\"UTZ_MCHR_OS_VER_NM\": \"\",\"UTZ_MCHR_MDL_NM\": \"\",\"UTZ_MCHR_APP_VER_NM\": \"\" },\"dataBody\": {} }";
    this.getAccBasicInfo = "{\"dataHeader\": {\"UTZPE_CNCT_IPAD\": \"\",\"UTZPE_CNCT_MCHR_UNQ_ID\": \"\",\"UTZPE_CNCT_TEL_NO_TXT\": \"\",\"UTZPE_CNCT_MCHR_IDF_SRNO\": \"\",\"UTZ_MCHR_OS_DSCD\": \"\",\"UTZ_MCHR_OS_VER_NM\": \"\",\"UTZ_MCHR_MDL_NM\": \"\",\"UTZ_MCHR_APP_VER_NM\": \"\" },\"dataBody\": {\"INQ_ACNO\": \"1002123456789\",\"INQ_BAS_DT\": \"20210220\",\"ACCT_KND\": \"P\",\"INQ_CUCD\": \"KRW\" } }";
    this.getAccTransList = "{\"dataHeader\": {\"UTZPE_CNCT_IPAD\": \"\",\"UTZPE_CNCT_MCHR_UNQ_ID\": \"\",\"UTZPE_CNCT_TEL_NO_TXT\": \"\",\"UTZPE_CNCT_MCHR_IDF_SRNO\": \"\",\"UTZ_MCHR_OS_DSCD\": \"\",\"UTZ_MCHR_OS_VER_NM\": \"\",\"UTZ_MCHR_MDL_NM\": \"\",\"UTZ_MCHR_APP_VER_NM\": \"\" },\"dataBody\": {\"INQ_ACNO\": \"1002123456789\",\"INQ_STA_DT\": \"20210101\",\"INQ_END_DT\": \"20210310\",\"NEW_DT\": \"20140522\",\"ACCT_KND\": \"P\",\"CUCD\": \"KRW\" } }";
    this.getCellCerti = "{\"dataHeader\": {\"UTZPE_CNCT_IPAD\": \"\",\"UTZPE_CNCT_MCHR_UNQ_ID\": \"\",\"UTZPE_CNCT_TEL_NO_TXT\": \"\",\"UTZPE_CNCT_MCHR_IDF_SRNO\": \"\",\"UTZ_MCHR_OS_DSCD\": \"\",\"UTZ_MCHR_OS_VER_NM\": \"\",\"UTZ_MCHR_MDL_NM\": \"\",\"UTZ_MCHR_APP_VER_NM\": \"\" },\"dataBody\": {\"COMC_DIS\": \"1\",\"HP_NO\": \"01012345678\",\"HP_CRTF_AGR_YN\": \"Y\",\"FNM\": \"홍길동\",\"RRNO_BFNB\": \"930216\",\"ENCY_RRNO_LSNM\": \"1234567\" } }";
//    this.getCellCerti = "{\n" +
//            "\"dataHeader\": {\n" +
//            "\"UTZPE_CNCT_IPAD\": \"10.0.0.1\",\n" +
//            "\"UTZPE_CNCT_MCHR_UNQ_ID\": \"3B5E6E7B\",\n" +
//            "\"UTZPE_CNCT_TEL_NO_TXT\": \"01012341234\",\n" +
//            "\"UTZPE_CNCT_MCHR_IDF_SRNO\": \"IMEI\",\n" +
//            "\"UTZ_MCHR_OS_DSCD\": \"1\",\n" +
//            "\"UTZ_MCHR_OS_VER_NM\": \"8.0.0\",\n" +
//            "\"UTZ_MCHR_MDL_NM\": \"SM-G930S\",\n" +
//            "\"UTZ_MCHR_APP_VER_NM\": \"1.0.0\"\n" +
//            "},\n" +
//            "\"dataBody\": {\n" +
//            "\"COMC_DIS\" : \"1\",\n" +
//            "\" HP_NO \" : “01012341234\",\n" +
//            "\" HP_CRTF_AGR_YN\" : \"Y,\n" +
//            "\" RRNO_BFNB \" : \"670122\",\n" +
//            "\"FNM\" : \"우약자\",\n" +
//            "“ENCY_RRNO_LSNM” : “*********************”\n" +
//            " },\n" +
//            "}";
    this.executeCellCerti = "{\n" +
            "\"dataHeader\": {\n" +
            "\"UTZPE_CNCT_IPAD\": \"111.111.111.111|222.222.222.222\",\n" +
            "\"UTZPE_CNCT_MCHR_UNQ_ID\": \"3B5E6E7B\",\n" +
            "\"UTZPE_CNCT_TEL_NO_TXT\": \"01012341234\",\n" +
            "\"UTZPE_CNCT_MCHR_IDF_SRNO\": \"IMEI\",\n" +
            "\"UTZ_MCHR_OS_DSCD\": \"1\",페이지 15 / 79\n" +
            "\"UTZ_MCHR_OS_VER_NM\": \"8.0.0\",\n" +
            "\"UTZ_MCHR_MDL_NM\": \"SM-G930S\",\n" +
            "\"UTZ_MCHR_APP_VER_NM\": \"1.0.0\"\n" +
            "},\n" +
            "\"dataBody\": {\n" +
            "\" RRNO_BFNB\": 19611122,\n" +
            "\" ENCY_RRNO_LSNM\" : “1234567:\n" +
            "\" SMS_CRTF_NO \" : “111111”\n" +
            "\" CRTF_UNQ_NO \" : “MG4374201711251563655826”,\n" +
            "}\n";
//    this.executeCellCerti = "{\"dataHeader\": {\"UTZPE_CNCT_IPAD\": \"\",\"UTZPE_CNCT_MCHR_UNQ_ID\": \"\",\"UTZPE_CNCT_TEL_NO_TXT\": \"\",\"UTZPE_CNCT_MCHR_IDF_SRNO\": \"\",\"UTZ_MCHR_OS_DSCD\": \"\",\"UTZ_MCHR_OS_VER_NM\": \"\",\"UTZ_MCHR_MDL_NM\": \"\",\"UTZ_MCHR_APP_VER_NM\": \"\" }, }\"dataBody\": {\"RRNO_BFNB\": \"930216\",\"ENCY_RRNO_LSNM\": \"1234567\",\"ENCY_SMS_CRTF_NO\": \"1111111\",\"CRTF_UNQ_NO\": \"MG12345678901234567890\" } }";
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
