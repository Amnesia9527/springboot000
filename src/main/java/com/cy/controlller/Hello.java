package com.cy.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @RequestMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "hello java80000000000000000000000000";
    }
}
