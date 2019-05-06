package com.qzb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(value = "/hello.do")
    public String hello() {
        System.out.println("hello!!!");
        return "demo/index";
    }

}
