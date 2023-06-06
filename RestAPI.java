package com.example.P1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class RestAPI {
    public KafkaP1 k1;

    public RestAPI(KafkaP1 k2){
        this.k1=k2;
    }
    //url will thus be :http:localhost:8080/api/kafka/publishing?msg="wtever msg to be sent";
    @GetMapping("/publishing")
    //publish is the method
    //get method to get the valus of the message/event to be sent by producer
    public ResponseEntity<String> publish (@RequestParam("msg")String msg){
        k1.sendingmsg(msg);
        return ResponseEntity.ok("Hey,your message is successfully sent to the topic ^^");

    }

}
