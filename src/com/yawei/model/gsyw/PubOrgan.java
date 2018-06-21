package com.yawei.model.gsyw;

import java.math.BigDecimal;

public class PubOrgan {
    private String organCode;

    private String organName;

    private String parentCode;

    private String organPath;

    private BigDecimal seq;

    private String organType;

    private String organClass;

    private String isOrgDep;

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getOrganPath() {
        return organPath;
    }

    public void setOrganPath(String organPath) {
        this.organPath = organPath;
    }

    public BigDecimal getSeq() {
        return seq;
    }

    public void setSeq(BigDecimal seq) {
        this.seq = seq;
    }

    public String getOrganType() {
        return organType;
    }

    public void setOrganType(String organType) {
        this.organType = organType;
    }

    public String getOrganClass() {
        return organClass;
    }

    public void setOrganClass(String organClass) {
        this.organClass = organClass;
    }

    public String getIsOrgDep() {
        return isOrgDep;
    }

    public void setIsOrgDep(String isOrgDep) {
        this.isOrgDep = isOrgDep;
    }
}