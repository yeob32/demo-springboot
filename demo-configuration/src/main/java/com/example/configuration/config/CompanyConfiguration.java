package com.example.configuration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyConfiguration {

    @Bean
    public Company company() {
        System.out.println("regist bean company");
        return new Company("yeob32");
    }
}
