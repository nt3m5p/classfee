package com.zhangle.classfeeadmin.controller;

import com.zhangle.classfeeadmin.model.User;
import com.zhangle.classfeeadmin.service.UserService;
import com.zhangle.classfeecommon.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping("/hello")
    public String hello() {

        return "hello world";
    }

//    @RequestMapping("/selectList")
//    public List<User> selectList() {
//
//        return userService.selectList();
//    }

    @RequestMapping("/selectList")
    public CommonResult<List<User>> selectList() {
        List<User> subjectList = userService.selectList();
        return CommonResult.success(subjectList);
    }


}