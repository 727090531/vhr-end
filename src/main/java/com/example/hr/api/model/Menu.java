package com.example.hr.api.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * menu
 * @author 
 */
@Data
public class Menu implements Serializable {
    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private Integer parentId;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;

    private Meta meta;
    //子路由的的信息放在里面
    private List<Menu> children;
}