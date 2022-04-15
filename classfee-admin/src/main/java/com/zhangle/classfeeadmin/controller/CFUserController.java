package com.zhangle.classfeeadmin.controller;

import com.zhangle.classfeeadmin.model.CFUser;
import com.zhangle.classfeeadmin.service.CFUserService;
import com.zhangle.classfeecommon.api.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CFUserController {

    private final CFUserService cfUserService;

    public CFUserController(CFUserService cfUserService) {
        this.cfUserService = cfUserService;
    }


    @RequestMapping("/listAll")
    public CommonResult<List<CFUser>> listAll() {
        List<CFUser> subjectList = cfUserService.listAll();
        return CommonResult.success(subjectList);
    }


}