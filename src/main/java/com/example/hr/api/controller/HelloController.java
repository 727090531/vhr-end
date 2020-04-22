package com.example.hr.api.controller;

import com.example.hr.api.model.RespBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author XieL
 * @date 2020/4/19 11:13
 */
@CrossOrigin(origins = {"http://localhost:8080","null"})
@RestController
public class HelloController {
   @GetMapping("/hello")
   public String hello(){
       return "hello";
   }

   @GetMapping("/login")
   public RespBean login(){return RespBean.error("尚未登录，请登录");}
}
