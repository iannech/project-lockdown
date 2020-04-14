package com.org.projectlockdown.location.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class ConfigProperties {


    private String base_url;

    private String mapsApiKey;

    public String getBase_url() {
        return base_url;
    }

    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }

    public String getMapsApiKey() {
        return mapsApiKey;
    }

    public void setMapsApiKey(String mapsApiKey) {
        this.mapsApiKey = mapsApiKey;
    }
}
