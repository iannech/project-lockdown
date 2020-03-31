package com.org.projectlockdownshopping.payload;

import java.io.Serializable;
import java.util.Date;

public class CheckAvailabilityRequest implements Serializable {

    private String phoneNumber;

    private Date shoppingTime;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getShoppingTime() {
        return shoppingTime;
    }

    public void setShoppingTime(Date shoppingTime) {
        this.shoppingTime = shoppingTime;
    }
}
