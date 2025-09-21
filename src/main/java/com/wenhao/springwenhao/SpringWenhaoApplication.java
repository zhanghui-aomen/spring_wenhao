package com.wenhao.springwenhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot应用程序主启动类
 * 包含Spring MVC、MyBatis、MySQL驱动
 */
@SpringBootApplication
public class SpringWenhaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWenhaoApplication.class, args);
    }
}