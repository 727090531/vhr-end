package com.example.hr.api.mapper;

import com.example.hr.api.model.Menu;
import com.example.hr.api.model.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    @Select("select * from role")
    List<Role> getAllRoles();

    List<Menu> getAllMenus();
}