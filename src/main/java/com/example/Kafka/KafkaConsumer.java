package com.example.Kafka;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics="dev")
    public void consume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));

    }
}
