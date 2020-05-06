package com.example.hr.api.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * joblevel
 * @author 
 */
@Data
public class JobLevel implements Serializable {
    private Integer id;

    /**
     * 职称名称
     */
    private String name;

    private Object titlelevel;
    @JsonFormat(pattern = "yyyy-MM-dd hh:hh",timezone = "Asia/Shanghai")
    private Date createdate;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;
}