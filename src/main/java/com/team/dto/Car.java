package com.team.dto;

import java.util.Date;

public class Car {
    private Integer id;

    private String number;

    private Integer model;

    private Integer type;

    private String flapper;

    private String driver;

    private Date purchase;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFlapper() {
        return flapper;
    }

    public void setFlapper(String flapper) {
        this.flapper = flapper == null ? null : flapper.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public Date getPurchase() {
        return purchase;
    }

    public void setPurchase(Date purchase) {
        this.purchase = purchase;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}