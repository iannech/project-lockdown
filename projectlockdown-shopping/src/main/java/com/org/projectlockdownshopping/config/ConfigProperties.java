package com.org.projectlockdownshopping.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "configProperties")
public class ConfigProperties {

    // RabbitMQ
    private String topicExchangeName;
    private String queueName;
    private String exchangeName;
    private String routingKey;

    public String getTopicExchangeName() {
        return topicExchangeName;
    }

    public void setTopicExchangeName(String topicExchangeName) {
        this.topicExchangeName = topicExchangeName;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }
}
