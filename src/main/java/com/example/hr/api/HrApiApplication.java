package com.example.hr.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.hr.api.mapper")
public class HrApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrApiApplication.class, args);
    }

}
