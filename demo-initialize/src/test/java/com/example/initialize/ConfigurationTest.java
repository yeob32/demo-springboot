package com.example.initialize;

import com.example.configuration.config.Company;
import com.example.configuration.config.CompanyConfiguration;
import com.example.initialize.config.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

public class ConfigurationTest {

    private final ApplicationContextRunner applicationContextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(CompanyConfiguration.class)); // CompanyConfiguration 자동 설정 등록

    @Test
    @DisplayName("자동 설정 동작 테스트")
    public void test() {
        applicationContextRunner.withUserConfiguration(AppConfig.class)
//                .withBean(Company.class) // Company 빈 직접 등록
                .run(context -> {
                    Assertions.assertThat(context).hasSingleBean(Company.class);
                });
    }
}
