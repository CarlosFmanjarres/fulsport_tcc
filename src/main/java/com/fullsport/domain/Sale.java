package com.fullsport.domain;

import java.time.LocalDateTime;

public class Sale {

    private Integer saleId;

    private LocalDateTime date;

    public double getActive() {
        return active;
    }

    public void setActive(double active) {
        this.active = active;
    }

    private Double total;

    private double active;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
