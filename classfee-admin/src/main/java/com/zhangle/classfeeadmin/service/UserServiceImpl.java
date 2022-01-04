package com.zhangle.classfeeadmin.service;

import com.zhangle.classfeeadmin.mapper.UserMapper;
import com.zhangle.classfeeadmin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserMapper uMapper;

    @Override
    public List<User> selectList() {
        return uMapper.selectList();
    }


}