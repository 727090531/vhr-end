package com.example.hr.api.controller.system.basic;

import com.example.hr.api.model.Menu;
import com.example.hr.api.model.RespBean;
import com.example.hr.api.model.Role;
import com.example.hr.api.service.MenuService;
import com.example.hr.api.service.system.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author XieL
 * @date 2020/4/29 10:35
 */
@RestController
@RequestMapping("/system/basic/permiss")
public class PermissionController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public RespBean getAllRoles(){
        List<Role> roles = roleService.getAllRoles();
        return RespBean.ok("", roles);
    }

    @GetMapping("/menus")
    public RespBean getAllMenus() {
        List<Menu> menus = roleService.getAllMenus();
        return RespBean.ok("", menus);
    }

    @GetMapping("/mid/{rid}")
    @ApiOperation(value = "获取角色对应的菜单id集合", notes = "角色对应的菜单id列表")
    public RespBean getMidsByRid(@PathVariable Integer rid) {
        List<Integer> rids = menuService.getMidsByRid(rid);
        return RespBean.ok("", rids);
    }
//    @PutMapping("/")
//    @ApiOperation(value = "修改角色对应的菜单")
//    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
//        if(menuService.updateMenuRole(rid, mids)) {
//            return RespBean.ok("更新成功");
//        }
//        return RespBean.error("更新失败");
//    }

    @PostMapping("/role")
    @ApiOperation(value = "添加角色")
    public RespBean addRole(@RequestBody Role role) {
        if (roleService.addRole(role) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/role/{rid}")
    @ApiOperation(value = "根据角色id删除角色")
    public RespBean deleteRoleById(@PathVariable Integer rid) {
        if (roleService.deleteRoleById(rid) == 1) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }
}
