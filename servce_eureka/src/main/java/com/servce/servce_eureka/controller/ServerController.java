package com.servce.servce_eureka.controller;

import com.servce.servce_eureka.service.TAcTokenService;
import com.servce.servce_eureka.service.TUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/server")
public class ServerController {
    @Resource
    private TAcTokenService tAcTokenService;
    @Resource
    private TUserService tUserService;

    @GetMapping("/getMsg")
    public String getMsg(){
        return tUserService.findAll().toString();
    }
}

