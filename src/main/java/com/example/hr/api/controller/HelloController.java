package com.example.hr.api.controller;

import com.example.hr.api.model.RespBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author XieL
 * @date 2020/4/19 11:13
 */
@RestController
public class HelloController {

   @GetMapping("/hello")
   public String hello() {
      return "hello";
   }
}
