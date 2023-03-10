package com.devkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class AutoCreateConfig {

    //Creating a kafka topic using java code [Not recommended in prod]
    @Bean
    public NewTopic libraryEvent() {
        return TopicBuilder.name("library-events")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
