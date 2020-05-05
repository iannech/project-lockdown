package com.org.projectlockdown.messaging;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.org.projectlockdown.config.ConfigProperties;
import com.org.projectlockdown.payload.Event;
import com.org.projectlockdown.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class EventProducer {

    private static Logger log = LoggerFactory.getLogger(EventProducer.class);

    @Autowired
    private ConfigProperties configProperties;

    private final RabbitTemplate rabbitTemplate;

    public EventProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void onEvent(Event event) throws JsonProcessingException {
        try {

            rabbitTemplate.convertAndSend(configProperties.getExchangeName(), configProperties.getRoutingKey(),
                    Utils.writeObjectAsString(event));

        }catch (Exception e) {

            log.info("LOG = {} | EVENT_PAYLOAD = {}", "EVENT STREAM ERROR", Utils.writeObjectAsString(event));
        }
    }



}

