package com.org.projectlockdownshopping.messaging;

import com.google.gson.Gson;
import com.org.projectlockdownshopping.payload.Event;
import com.org.projectlockdownshopping.payload.ShoppingRequest;
import com.org.projectlockdownshopping.service.ShoppingScheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

    private static final Logger logger = LoggerFactory.getLogger(EventConsumer.class);
    @Autowired
    ShoppingScheduler shoppingScheduler;

    @RabbitListener(queues = "${configProperties.topicExchangeName}")
    public void listenerToShoppingRequests(byte[] message) {
        String msg = new String(message);


        Event event = new Gson().fromJson(msg, Event.class);

        ShoppingRequest shoppingRequest = (ShoppingRequest) event.getEventSpecificData();

        logger.info("CUSTOMER_PHONE_NUMBER ={} | SHOPPING_TIME = {} | EVENT_ID = {}", shoppingRequest.getCustomerPhoneNumber(),
                shoppingRequest.getShoppingTime(), event.getId());

        shoppingScheduler.scheduleCustomerShoppingRequest(shoppingRequest);
    }
}
