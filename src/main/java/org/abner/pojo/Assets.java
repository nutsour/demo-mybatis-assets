package org.abner.pojo;


import java.sql.Date;

public class Assets {
    private Integer assetsId;
    private String assetsName;
    private Integer assetsNumber;
    private Date assetsDate;
    private String assetsLocation;

    public Assets() {
    }

    public Assets(Integer assetsId, String assetsName, Integer assetsNumber, Date assetsDate, String assetsLocation) {
        this.assetsId = assetsId;
        this.assetsName = assetsName;
        this.assetsNumber = assetsNumber;
        this.assetsDate = assetsDate;
        this.assetsLocation = assetsLocation;
    }

    public Integer getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(Integer assetsId) {
        this.assetsId = assetsId;
    }

    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public Integer getAssetsNumber() {
        return assetsNumber;
    }

    public void setAssetsNumber(Integer assetsNumber) {
        this.assetsNumber = assetsNumber;
    }

    public Date getAssetsDate() {
        return assetsDate;
    }

    public void setAssetsDate(Date assetsDate) {
        this.assetsDate = assetsDate;
    }

    public String getAssetsLocation() {
        return assetsLocation;
    }

    public void setAssetsLocation(String assetsLocation) {
        this.assetsLocation = assetsLocation;
    }

    @Override
    public String toString() {
        return "Assets{" +
                "assetsId=" + assetsId +
                ", assetsName='" + assetsName + '\'' +
                ", assetsNumber=" + assetsNumber +
                ", assetsDate=" + assetsDate +
                ", assetsLocation='" + assetsLocation + '\'' +
                '}';
    }
}
