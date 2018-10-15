package cn.mnquan.model;

import java.util.Date;

public class TbMnAgencyDo {
    private String agencyAccount;

    private String id;

    private String agencyCode;

    private String agencyGrade;

    private String state;

    private Date createdAt;

    private Date updatedAt;

    public String getAgencyAccount() {
        return agencyAccount;
    }

    public void setAgencyAccount(String agencyAccount) {
        this.agencyAccount = agencyAccount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getAgencyGrade() {
        return agencyGrade;
    }

    public void setAgencyGrade(String agencyGrade) {
        this.agencyGrade = agencyGrade;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}