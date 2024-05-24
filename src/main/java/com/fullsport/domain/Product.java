package com.fullsport.domain;

public class Product {

    private Integer PRODUCTID;

    private String NAME;

    private String DESCRIPTION;

    private Integer PRICE;

    private Integer STOCK;



    public Integer getPRODUCTID() {
        return PRODUCTID;
    }

    public void setPRODUCTID(Integer PRODUCTID) {
        this.PRODUCTID = PRODUCTID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public Integer getPRICE() {
        return PRICE;
    }

    public void setPRICE(Integer PRICE) {
        this.PRICE = PRICE;
    }

    public Integer getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(Integer STOCK) {
        this.STOCK = STOCK;
    }

}
