package com.zhangle.classfeeadmin.mapper;

import com.zhangle.classfeeadmin.model.CFUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CFUserMapper {

    List<CFUser> listAll();
}