package com.org.projectlockdown.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConfigurationProperties
@Service
public class ConfigProperties {

    // ACCEPTED APPS
    private String whitelistedApps;

    // Response Messages
    private String statusOk;
    private String badRequest;
    private String serverError;

    // Event params
    private long subscriptionId;
    private String key;
    private String message;

    // Queue/Topic
    private String eventsTopic;


    public String getWhitelistedApps() {
        return whitelistedApps;
    }

    public void setWhitelistedApps(String whitelistedApps) {
        this.whitelistedApps = whitelistedApps;
    }

    public String getStatusOk() {
        return statusOk;
    }

    public void setStatusOk(String statusOk) {
        this.statusOk = statusOk;
    }

    public String getBadRequest() {
        return badRequest;
    }

    public void setBadRequest(String badRequest) {
        this.badRequest = badRequest;
    }

    public String getServerError() {
        return serverError;
    }

    public void setServerError(String serverError) {
        this.serverError = serverError;
    }

    public long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(long subscriptionId) {
        this.subscriptionId = subscriptionId;
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

    public String getEventsTopic() {
        return eventsTopic;
    }

    public void setEventsTopic(String eventsTopic) {
        this.eventsTopic = eventsTopic;
    }
}
