package com.zhangle.classfeeadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestWebController {


    @GetMapping("/selectListTest")
    public String usertest() {
        return "selectListTest";
    }
}