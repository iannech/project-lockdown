package com.org.projectlockdownshopping.payload;

import java.io.Serializable;
import java.time.Instant;
import java.util.*;

public class ShoppingRequest implements Serializable {


    private String phoneNumber;

    private Date shoppingTime;

    private Instant timestamp;

    private List<Metadata> metadata = new ArrayList<>();

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

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    public Map fetchFromMap() {
        Map<String, String> map = new HashMap<>();

        for(Metadata m : metadata) {
            map.put(m.getKey(), m.getValue());
        }
        return map;
    }
}
