package com.oneillrpp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    @Author: oneillRPP
*/

@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }


}
