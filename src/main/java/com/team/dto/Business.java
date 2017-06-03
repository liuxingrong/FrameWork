package com.team.dto;

import java.util.Date;

public class Business {
    private Integer id;

    private Integer number;

    private String telephone;

    private Integer deadId;

    private String deadName;

    private Date pickUpTime;

    private String pickUpAddress;

    private Integer carId;

    private Integer driverId;

    private Integer refrigeratedId;

    private Integer userId;

    private Integer farewellHallId;

    private Integer cremationFurnaceId;

    private Integer charge;

    private String note;

    private Integer type;

    private Date createTime;

    private String flapper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getDeadId() {
        return deadId;
    }

    public void setDeadId(Integer deadId) {
        this.deadId = deadId;
    }

    public String getDeadName() {
        return deadName;
    }

    public void setDeadName(String deadName) {
        this.deadName = deadName == null ? null : deadName.trim();
    }

    public Date getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Date pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress == null ? null : pickUpAddress.trim();
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getRefrigeratedId() {
        return refrigeratedId;
    }

    public void setRefrigeratedId(Integer refrigeratedId) {
        this.refrigeratedId = refrigeratedId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFarewellHallId() {
        return farewellHallId;
    }

    public void setFarewellHallId(Integer farewellHallId) {
        this.farewellHallId = farewellHallId;
    }

    public Integer getCremationFurnaceId() {
        return cremationFurnaceId;
    }

    public void setCremationFurnaceId(Integer cremationFurnaceId) {
        this.cremationFurnaceId = cremationFurnaceId;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFlapper() {
        return flapper;
    }

    public void setFlapper(String flapper) {
        this.flapper = flapper == null ? null : flapper.trim();
    }
}