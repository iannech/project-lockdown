package com.org.projectlockdown.model;

import javax.persistence.MappedSuperclass;

/**
* An Abstract class for User : ProjectLockDown
 *
 * @Author Ian Nechenje
* */
@MappedSuperclass
public abstract class AUser {

    private String username;

    private long phoneNumber;

    public AUser(String username, long phoneNumber) {
        this.username = username;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AUser() {
    }

    public abstract void signup();

    public abstract boolean deleteAccount();

}
