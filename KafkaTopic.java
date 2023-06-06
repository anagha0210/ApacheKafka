package com.example.P1;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
//to set up the class as a springboot application
@Configuration
public class KafkaTopic{
    //to annotate the method as a spring bean(object)
    @Bean
    public NewTopic createTopic(){
        return TopicBuilder.name("intern").build();
    }


}
