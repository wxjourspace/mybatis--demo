package com.bluesky.bean;


public class ConsultConfigArea {

  private String areaCode;

  private String areaName;

  private Integer state;

  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "area code:" + areaCode + ",area name:" + areaName + ",state:" + state;
  }
}
