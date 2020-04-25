package com.example.initialize.config;

import com.example.configuration.config.Company;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    /**
     * 스프링부트 2.1
     * spring.main.allow-bean-definition-overriding=false
     * Error 발생
     *
     * @return
     */
    @Bean
    @ConditionalOnBean
    public Company company() { // 왜 안되냐....ㅋㅋㅋ
        System.out.println("override bean test");
        return new Company("my company");
    }

    @Bean
    @ConditionalOnMissingBean
    public String test() {
        System.out.println("regist bean test");
        return "test!!";
    }
}
