package com.wenhao.springwenhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * 用于演示的Spring Boot应用程序启动类
 * 排除数据库相关组件用于演示
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.wenhao.springwenhao", 
               excludeFilters = {
                   @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*\\.mapper\\..*"),
                   @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*\\.service\\..*"),
                   @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*UserController.*"),
                   @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*MyBatisConfig.*")
               })
public class SpringWenhaoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWenhaoDemoApplication.class, args);
    }
}