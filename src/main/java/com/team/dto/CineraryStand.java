package com.team.dto;

public class CineraryStand {
    private Integer id;

    private String row;

    private String standCase;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row == null ? null : row.trim();
    }

    public String getStandCase() {
        return standCase;
    }

    public void setStandCase(String standCase) {
        this.standCase = standCase == null ? null : standCase.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}