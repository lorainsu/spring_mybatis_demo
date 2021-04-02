package com.lorain.mybatis_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ImportResource(locations = "classpath:spring/applicationContext.xml")
@MapperScan(basePackages = {"com.lorain.mybatis_demo.dao.mapper"})
@EnableTransactionManagement
public class MybatisDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class, args);
    }

}

