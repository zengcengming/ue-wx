package com.servce.servce_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class ServceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServceEurekaApplication.class, args);
    }

}
