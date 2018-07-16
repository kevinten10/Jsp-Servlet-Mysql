package com.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home-tap")
public class TapController {

    private static Logger logger = LoggerFactory.getLogger(TapController.class);

    @RequestMapping(value = "/main")
    public String main() {
        logger.info("/home-tap/main");
        return "home-tap/main";
    }

    @RequestMapping(value = "/admin")
    public String admin() {
        logger.info("/home-tap/admin");
        return "home-tap/admin";
    }

    @RequestMapping(value = "/user")
    public String user() {
        logger.info("/home-tap/user");
        return "home-tap/user";
    }

    @RequestMapping(value = "/diary")
    public String diary() {
        logger.info("/home-tap/diary");
        return "home-tap/diary";
    }

    @RequestMapping(value = "/image")
    public String image() {
        logger.info("/home-tap/image");
        return "home-tap/image";
    }
}