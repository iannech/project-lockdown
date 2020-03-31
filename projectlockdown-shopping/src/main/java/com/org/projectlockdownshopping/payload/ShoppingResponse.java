package com.org.projectlockdownshopping.payload;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingResponse implements Serializable {

    private String requestId;

    private String responseCode;

    private String responseMessage;

    private Timestamp timestamp;

    List<Metadata> responseBody = new ArrayList<>();

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public List<Metadata> getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(List<Metadata> responseBody) {
        this.responseBody = responseBody;
    }

    public Map fetchFromMap() {
        Map<String, String> map = new HashMap<>();

        for(Metadata m : responseBody) {
            map.put(m.getKey(), m.getValue());
        }
        return map;
    }
}
