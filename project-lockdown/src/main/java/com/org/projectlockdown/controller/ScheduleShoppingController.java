package com.org.projectlockdown.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.org.projectlockdown.config.ConfigProperties;
import com.org.projectlockdown.exception.BadRequestException;
import com.org.projectlockdown.payload.CallbackResponse;
import com.org.projectlockdown.payload.ScheduleShoppingRequest;
import com.org.projectlockdown.payload.ScheduleShoppingResponse;
import com.org.projectlockdown.service.ShoppingScheduler;
import com.org.projectlockdown.utils.Constants;
import com.org.projectlockdown.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "api/lockdown")
public class ScheduleShoppingController {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleShoppingController.class);

    @Autowired
    ConfigProperties configProperties;

    @Autowired
    ShoppingScheduler shoppingScheduler;

    @PostMapping(value = "/schedule-shopping")
    public ScheduleShoppingResponse scheduleShoppingTime(@RequestHeader HttpHeaders httpHeaders,
                                                         @RequestHeader(Constants.X_OPERATION_NAME) String operationName,
                                                         @RequestHeader(Constants.X_SOURCE_SYSTEM) String sourceApp,
                                                         @RequestHeader(Constants.X_CORRELATION_CONVERSATION_ID) String requestID,
                                                         @RequestBody ScheduleShoppingRequest shoppingRequest) throws JsonProcessingException {

        String sourceIP = String.valueOf(httpHeaders.getHost());

        ScheduleShoppingResponse scheduleShoppingResponse;

        logger.info("LOG = {} | REQUEST_ID = {} |SOURCE_IP = {} | PAYLOAD = {}", "SCHEDULE_SHOPPING", requestID, sourceIP,
                Utils.writeObjectAsString(shoppingRequest));

        // validate headers
        final List<String> whitelistedApps = Arrays.asList(configProperties.getWhitelistedApps().split("\\s*,\\s*"));

        if(!whitelistedApps.contains(sourceApp)){
            throw new BadRequestException("The application is not whitelisted!");
        } else {

            // forward request to shopping service via broker

            shoppingScheduler.scheduleShoppingTime(shoppingRequest, requestID);

            // Send acknowledgement to customer
            scheduleShoppingResponse  = new ScheduleShoppingResponse(Constants.STATUS_OK, configProperties.getStatusOk(), requestID, operationName);
            return scheduleShoppingResponse;

        }

        // respond to customer with acknowledgement
    }

//    @PostMapping(value = "/schedule-shopping/callback")
//    public CallbackResponse scheduleShoppingCallback() {
//
//
//    }
}
