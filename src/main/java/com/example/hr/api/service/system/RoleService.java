package com.example.hr.api.service.system;

import com.example.hr.api.mapper.RoleMapper;
import com.example.hr.api.model.Menu;
import com.example.hr.api.model.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author XieL
 * @date 2020/4/29 10:39
 */
@Service
public class RoleService {
    @Resource
    RoleMapper roleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public List<Menu> getAllMenus() {
        return roleMapper.getAllMenus();
    }

    public Integer addRole(Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        return roleMapper.insert(role);
    }

    public Integer deleteRoleById(Integer rid) {
        return roleMapper.deleteByPrimaryKey(rid);
    }
}
