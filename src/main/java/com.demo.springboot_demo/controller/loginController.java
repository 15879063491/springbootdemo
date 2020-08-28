package com.demo.springboot_demo.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class loginController {

    Logger log = Logger.getLogger(loginController.class);

    @RequestMapping("/login")
    public String login(){
        System.out.println("===============");
        log.info("测试");
        return "login";
    }



}
