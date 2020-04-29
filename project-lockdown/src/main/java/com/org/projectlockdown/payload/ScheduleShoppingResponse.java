package com.org.projectlockdown.payload;

import java.io.Serializable;

/**
 * Have Shoppi
 * */
public class ScheduleShoppingResponse implements Serializable {

    private String responseCode;
    private String responseMessage;
    private String requestID;
    private String operationName;

    public ScheduleShoppingResponse(String responseCode, String responseMessage, String requestID, String operationName) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.requestID = requestID;
        this.operationName = operationName;
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
}
