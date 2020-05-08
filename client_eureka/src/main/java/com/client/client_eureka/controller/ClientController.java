package com.client.client_eureka.controller;

import com.client.client_eureka.client.ServerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ServerClient serverClient;
   /* @Autowired
    private RestTemplate restTemplate;*/

    @GetMapping("/getServerResult")
    public String getServerResult(){
        return serverClient.getMsg();
    }

   /* @GetMapping("/getServer")
    public String getServer(){
        return restTemplate.getForObject("http://servce/server/getMsg",String.class);
    }*/

}
