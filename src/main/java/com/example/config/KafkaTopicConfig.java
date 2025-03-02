package com.example.config;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic devTopic(){
        return TopicBuilder.name("dev")
                .build();
    }

}
