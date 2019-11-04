package com.example.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ProviderController {

    private static Logger  logger = LoggerFactory.getLogger(ProviderController.class);

    @RequestMapping("/hello")
    public String hello(){
        logger.info("hello debug world "+new Date());
        logger.debug("hello debug world "+new Date());
        logger.error("hello debug world "+new Date());
        return "Hello World";
    }

}
