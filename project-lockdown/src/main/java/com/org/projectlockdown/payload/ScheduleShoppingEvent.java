package com.org.projectlockdown.payload;

import java.util.Date;

/**
 * An Event raised to schedule customer shopping time
 *
 * @Standard Event model across all services raising events.
 * */
public class ScheduleShoppingEvent {

    private long id;

    private String key;

    private String message;

    private long subscriptionId;

    private Object eventSpecificData;

    private Date createdAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Object getEventSpecificData() {
        return eventSpecificData;
    }

    public void setEventSpecificData(Object eventSpecificData) {
        this.eventSpecificData = eventSpecificData;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
