package com.org.projectlockdownshopping.payload;

import java.io.Serializable;

public class Metadata implements Serializable {

    private String key;

    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
