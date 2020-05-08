package com.client.client_eureka.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//name属性的值为需要调用的组件名称
@FeignClient(name = "servce")
public interface ServerClient {

    //需要调用的方法
    @GetMapping("/server/getMsg")
    String getMsg();
}
