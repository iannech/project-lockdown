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

    // To change to LatLong
    private String physicalLocation;

    public AShop() {
    }

    public AShop(String shopName, long phoneNumber, String businessType, String physicalLocation) {
        this.shopName = shopName;
        this.phoneNumber = phoneNumber;
        this.businessType = businessType;
        this.physicalLocation = physicalLocation;
    }

    public abstract void signup();

    public abstract boolean deleteAccount();



}
