package com.bluesky.bean;

import java.util.Date;

public class ConsultRecord {

    private Integer id;

    private String psptId;

    private String name;

    private Date activeTime;

    private String autograph;

    private String ispass;

    private String docautograph;

    private String fingerprint;

    private String printFlag;

    private String handState;

    private String remark;

    public String getPsptId() {
        return psptId;
    }

    public void setPsptId(String psptId) {
        this.psptId = psptId;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getIspass() {
        return ispass;
    }

    public void setIspass(String ispass) {
        this.ispass = ispass;
    }

    public String getDocautograph() {
        return docautograph;
    }

    public void setDocautograph(String docautograph) {
        this.docautograph = docautograph;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHandState() {
        return handState;
    }

    public void setHandState(String handState) {
        this.handState = handState;
    }
}
