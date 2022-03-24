package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class LineOrderResponse {

    private String homeId;
    private String homeStatus;
    private String homeTargetStatus;
    private Date homeTargetStatusDate;
    private Integer householdsNumber;
    private Integer businessLocations;
    @JsonProperty("GEE")
    private GEE gee;

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getHomeStatus() {
        return homeStatus;
    }

    public void setHomeStatus(String homeStatus) {
        this.homeStatus = homeStatus;
    }

    public String getHomeTargetStatus() {
        return homeTargetStatus;
    }

    public void setHomeTargetStatus(String homeTargetStatus) {
        this.homeTargetStatus = homeTargetStatus;
    }

    public Date getHomeTargetStatusDate() {
        return homeTargetStatusDate;
    }

    public void setHomeTargetStatusDate(Date homeTargetStatusDate) {
        this.homeTargetStatusDate = homeTargetStatusDate;
    }

    public Integer getHouseholdsNumber() {
        return householdsNumber;
    }

    public void setHouseholdsNumber(Integer householdsNumber) {
        this.householdsNumber = householdsNumber;
    }

    public Integer getBusinessLocations() {
        return businessLocations;
    }

    public void setBusinessLocations(Integer businessLocations) {
        this.businessLocations = businessLocations;
    }

    public GEE getGee() {
        return gee;
    }

    public void setGee(GEE gee) {
        this.gee = gee;
    }

}