package com.zhangle.classfeeadmin.mapper;

import com.zhangle.classfeeadmin.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> selectList();
}