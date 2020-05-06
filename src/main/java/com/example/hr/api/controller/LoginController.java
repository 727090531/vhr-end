package com.example.hr.api.controller;

import com.example.hr.api.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author XieL
 * @date 2020/4/22 9:12
 */
@RestController
@ApiIgnore
public class LoginController {
    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录");
    }

}
