package com.demo.springboot_demo.controller;


import com.demo.springboot_demo.util.LogWriteUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Slf4j
@Controller
public class loginController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("===============");
        String a=null;
        a.toString();
        log.info("查询节点【{}】返回报文：{}", LogWriteUtils.getJsonStr("再见了我的大学"), LogWriteUtils.getJsonStr("再见了我的应科"));
        return "login";
    }



}
