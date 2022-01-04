package com.zhangle.classfeeadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        // 这里返回的login指的是src/main/resources/templates目录下的login.html
        // 因此，我们需要在src/main/resources/templates目录下新建一个login.html
        // 当我们通过浏览器访问localhost:8080/login时即可访问到我们编写的login.html
        return "login";
    }

}