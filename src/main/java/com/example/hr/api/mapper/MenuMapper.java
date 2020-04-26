package com.example.hr.api.mapper;

import com.example.hr.api.model.Menu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    //增加获取菜单的方法
    List<Menu> getMenusByHrId(Integer id);
}