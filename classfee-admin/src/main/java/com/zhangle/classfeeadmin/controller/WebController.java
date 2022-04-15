package com.zhangle.classfeeadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    @GetMapping("/CFUserList")
    public String listALl() {
        return "CFUserList";
    }
}