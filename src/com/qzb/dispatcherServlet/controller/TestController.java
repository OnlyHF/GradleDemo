package com.qzb.dispatcherServlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value={"/home.do", "/hello.do"})
public class TestController {

    @RequestMapping(value = "/home.do", method = RequestMethod.GET)
    public String home() {
        System.out.println("home");
        return "index";
    }

    @RequestMapping(value = "/hello.do", method = RequestMethod.GET)
    public String hello() {
        System.out.println("home");
        return "index";
    }
}
