package com.zhangle.classfeeadmin.service;

import com.zhangle.classfeeadmin.mapper.CFUserMapper;
import com.zhangle.classfeeadmin.model.CFUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CFUserServiceImpl implements CFUserService {

    @Autowired
    private CFUserMapper uMapper;

    @Override
    public List<CFUser> listAll() {
        return uMapper.listAll();
    }


}