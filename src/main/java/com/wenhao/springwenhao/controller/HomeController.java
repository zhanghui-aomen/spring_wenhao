package com.wenhao.springwenhao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 首页控制器
 */
@RestController
public class HomeController {

    /**
     * 首页接口
     */
    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "欢迎使用Spring Boot + Spring MVC + MyBatis + MySQL项目");
        result.put("timestamp", LocalDateTime.now());
        result.put("status", "running");
        result.put("components", new String[]{"Spring Boot", "Spring MVC", "MyBatis", "MySQL Driver"});
        return result;
    }

    /**
     * 健康检查接口
     */
    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", "UP");
        result.put("timestamp", LocalDateTime.now());
        return result;
    }
}