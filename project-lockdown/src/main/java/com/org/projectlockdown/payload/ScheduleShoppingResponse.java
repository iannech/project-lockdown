package com.org.projectlockdown.payload;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Have Shoppi
 * */
public class ScheduleShoppingResponse implements Serializable {

    private String responseCode;
    private String responseMessage;
    private String requestID;
    private String operationName;
    private Timestamp timestamp;

    public ScheduleShoppingResponse(String responseCode, String responseMessage, String requestID, String operationName,
                                    Timestamp timestamp) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.requestID = requestID;
        this.operationName = operationName;
        this.timestamp = timestamp;
    }

    public ScheduleShoppingResponse() {
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

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
