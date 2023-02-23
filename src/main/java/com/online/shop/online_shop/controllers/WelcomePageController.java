package com.online.shop.online_shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomePageController {
    @RequestMapping({"","/","welcomePage"})
    private String welcomePage(){
        return "welcomePage";
    }
}
