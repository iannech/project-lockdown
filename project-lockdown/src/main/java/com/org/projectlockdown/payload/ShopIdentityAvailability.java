package com.org.projectlockdown.payload;

public class ShopIdentityAvailability {

    private boolean isAvailable;

    public ShopIdentityAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
