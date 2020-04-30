package com.org.projectlockdown.service;

import com.org.projectlockdown.config.ConfigProperties;
import com.org.projectlockdown.messaging.EventProducer;
import com.org.projectlockdown.payload.Event;
import com.org.projectlockdown.payload.ScheduleShoppingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class ShoppingScheduler {

    @Autowired
    ConfigProperties configProperties;

    @Autowired
    EventProducer eventProducer;

    // ASYNC Process
    public void scheduleShoppingTime(ScheduleShoppingRequest shoppingRequest, String requestID) {

        Random random = new Random();
        int id = 10000 + random.nextInt(900000)+Integer.parseInt(requestID);

        Event event = new Event();
        event.setEventSpecificData(shoppingRequest);
        event.setId(id);
        event.setSubscriptionId(configProperties.getSubscriptionId());
        event.setCreatedAt(new Date());
        event.setMessage(configProperties.getMessage());
        event.setKey(configProperties.getKey());

        eventProducer.onEvent(event);
    }
}
