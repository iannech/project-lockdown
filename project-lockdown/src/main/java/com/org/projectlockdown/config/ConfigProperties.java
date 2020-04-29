package com.org.projectlockdown.config;

import com.org.projectlockdown.payload.ScheduleShoppingResponse;
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
}
