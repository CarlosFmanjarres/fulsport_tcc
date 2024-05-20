package com.fullsport.domain;

public class DetailSale {

    private Integer detailId;

    private Integer quantity;

    private Double UnitPrice;

    private double active;

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public double getActive() {
        return active;
    }

    public void setActive(double active) {
        this.active = active;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        UnitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
