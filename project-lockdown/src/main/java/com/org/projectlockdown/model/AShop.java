package com.org.projectlockdown.model;

/**
 * An Abstract class for Shop : ProjectLockDown
 *
 * @Author Ian Nechenje
 * */
public abstract class AShop {

    private String shopName;

    private long phoneNumber;

    private String businessType;

    private String password;

    // To change to LatLong
    private String physicalLocation;

    public AShop() {
    }

    public AShop(String shopName, long phoneNumber, String businessType, String physicalLocation, String password) {
        this.shopName = shopName;
        this.phoneNumber = phoneNumber;
        this.businessType = businessType;
        this.physicalLocation = physicalLocation;
        this.password = password;
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

    public String getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(String physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void signup();

    public abstract boolean deleteAccount();



}
