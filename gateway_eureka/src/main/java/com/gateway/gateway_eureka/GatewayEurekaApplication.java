package com.gateway.gateway_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayEurekaApplication.class, args);
    }

}
