package com.lorain.mybatis_demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {
    @Value("${spring.datasource.password}")
    private String database_pwd;

    @Bean
    public String decryptedPwd() {
        return new StringBuilder(this.database_pwd).reverse().toString();
    }
}

