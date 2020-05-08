package com.servce.servce2_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Servce2EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Servce2EurekaApplication.class, args);
    }

}
