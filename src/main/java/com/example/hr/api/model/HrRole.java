package com.example.hr.api.model;

import java.io.Serializable;
import lombok.Data;

/**
 * hr_role
 * @author 
 */
@Data
public class HrRole implements Serializable {
    private Integer id;

    private Integer hrid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}