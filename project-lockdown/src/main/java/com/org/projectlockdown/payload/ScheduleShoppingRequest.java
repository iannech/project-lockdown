package com.org.projectlockdown.payload;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ScheduleShoppingRequest implements Serializable {

    private Date shoppingTime;

    private String customerPhoneNumber;

    private List<Metadata> additionalData;

    private Date timestamp;

    public Date getShoppingTime() {
        return shoppingTime;
    }

    public void setShoppingTime(Date shoppingTime) {
        this.shoppingTime = shoppingTime;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public List<Metadata> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(List<Metadata> additionalData) {
        this.additionalData = additionalData;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    // add List accessor
}
