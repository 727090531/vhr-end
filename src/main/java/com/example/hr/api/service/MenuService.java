package com.example.hr.api.service;

import com.example.hr.api.mapper.MenuMapper;
import com.example.hr.api.mapper.MenuRoleMapper;
import com.example.hr.api.model.Hr;
import com.example.hr.api.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author XieL
 * @date 2020/4/24 10:58
 */
@Service
public class MenuService {
    @Resource
    MenuMapper menuMapper;
    @Resource
    MenuRoleMapper menuRoleMapper;

    public List<Menu> getMenusByHrId(){
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    public List<Integer> getMidsByRid(Integer id) {
        return menuMapper.getMidsByRid(id);
    }

//    @Transactional
//    public boolean updateMenuRole(Integer rid, Integer[] mids) {
//        menuRoleMapper.deleteByRid(rid);
//        int num = menuRoleMapper.insertRecord(rid, mids);
//        return num == mids.length;
//    }
}
