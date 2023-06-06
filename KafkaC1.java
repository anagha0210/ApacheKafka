package com.example.P1;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaC1 {
    //logger is like a class that has different methods to display log msgs:error,warnin,info.(like system,out,println)
    //public static Logger logger = LoggerFactory.getLogger(KafkaC1.class);
    //kafkalistener is a class through which a equest to read the data from topic is done by a consumer application
    @KafkaListener(topics="intern",groupId="hello")
    //method to consume/rewuest msg from the topic ana13. COnsumer is part of the group myId
    public void consumingmsg(String msg){
       // logger.info(String.format("Hey,your Mesaage:%s \n is received!"));
       System.out.printf("Message received:- %s\n",msg);

    }
    
}
