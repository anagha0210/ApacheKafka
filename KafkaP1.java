package com.example.P1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class KafkaP1 {
//Creating logger instance of logger class to send the message
    public static Logger logger = LoggerFactory.getLogger(KafkaP1.class);
    //kafkatemplate class to enable producer application to send messages(Springboot provides readymade)
    public KafkaTemplate<String,String> kafkaT; //template object is kafkaT
    //Constructor
    public KafkaP1(KafkaTemplate<String,String> kafka1){
         this.kafkaT=kafka1;

    }
//meathod to send the message
    public void sendingmsg(String msg){
        logger.info(String.format("Hi!Message is sent! %s",msg));
        //through kafkat object,calling send method(topic,data)
        kafkaT.send("intern", msg);
    } 

    
}



