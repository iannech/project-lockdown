package com.org.projectlockdown.payload;

public class ShopProfile {

    private String shopName;

    private long phoneNumber;

    private String businessType;

    private String branchName;

    private String physicalLocation;

    public ShopProfile(String shopName, long phoneNumber, String businessType, String branchName, String physicalLocation) {
        this.shopName = shopName;
        this.phoneNumber = phoneNumber;
        this.businessType = businessType;
        this.branchName = branchName;
        this.physicalLocation = physicalLocation;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(String physicalLocation) {
        this.physicalLocation = physicalLocation;
    }
}
