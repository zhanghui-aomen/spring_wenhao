package com.wenhao.springwenhao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.wenhao.springwenhao.mapper")
public class MyBatisConfig {
    // MyBatis相关配置
}