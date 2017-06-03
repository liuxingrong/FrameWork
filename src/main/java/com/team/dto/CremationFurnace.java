package com.team.dto;

import java.util.Date;

public class CremationFurnace {
    private Integer id;

    private String number;

    private String byname;

    private Date startTime;

    private Date endTime;

    private Integer type;

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

    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname == null ? null : byname.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CremationFurnace{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", byname='" + byname + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}