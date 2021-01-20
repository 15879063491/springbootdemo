package com.demo.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
//public class SpringbootDemoApplication  extends SpringBootServletInitializer {
//
//
//    // 重写 configure方法
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
//    {
//        return application.sources(SpringbootDemoApplication.class);
//    }
//
//        public static void main(String[] args) {
//            SpringApplication.run(SpringbootDemoApplication.class,args);
//        }
//
//    }

@SpringBootApplication
public class SpringbootDemoApplication   {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class,args);
    }

}


