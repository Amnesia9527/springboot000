package com.cy.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @RequestMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "hello java8nnnnnnnnnnnnnnn";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String getHello4(){
        return "滚滚长江东逝水";
    }
}
