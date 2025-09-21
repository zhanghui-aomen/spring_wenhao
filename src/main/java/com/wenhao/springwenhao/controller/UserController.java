package com.wenhao.springwenhao.controller;

import com.wenhao.springwenhao.entity.User;
import com.wenhao.springwenhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户控制器
 * 演示Spring MVC功能
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取所有用户
     */
    @GetMapping
    public Map<String, Object> getAllUsers() {
        Map<String, Object> result = new HashMap<>();
        try {
            List<User> users = userService.findAll();
            result.put("success", true);
            result.put("data", users);
            result.put("message", "查询成功");
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return result;
    }

    /**
     * 根据ID获取用户
     */
    @GetMapping("/{id}")
    public Map<String, Object> getUserById(@PathVariable Long id) {
        Map<String, Object> result = new HashMap<>();
        try {
            User user = userService.findById(id);
            if (user != null) {
                result.put("success", true);
                result.put("data", user);
                result.put("message", "查询成功");
            } else {
                result.put("success", false);
                result.put("message", "用户不存在");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "查询失败: " + e.getMessage());
        }
        return result;
    }

    /**
     * 创建用户
     */
    @PostMapping
    public Map<String, Object> createUser(@RequestBody User user) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = userService.saveUser(user);
            if (rows > 0) {
                result.put("success", true);
                result.put("data", user);
                result.put("message", "用户创建成功");
            } else {
                result.put("success", false);
                result.put("message", "用户创建失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "用户创建失败: " + e.getMessage());
        }
        return result;
    }

    /**
     * 更新用户
     */
    @PutMapping("/{id}")
    public Map<String, Object> updateUser(@PathVariable Long id, @RequestBody User user) {
        Map<String, Object> result = new HashMap<>();
        try {
            user.setId(id);
            int rows = userService.saveUser(user);
            if (rows > 0) {
                result.put("success", true);
                result.put("data", user);
                result.put("message", "用户更新成功");
            } else {
                result.put("success", false);
                result.put("message", "用户更新失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "用户更新失败: " + e.getMessage());
        }
        return result;
    }

    /**
     * 删除用户
     */
    @DeleteMapping("/{id}")
    public Map<String, Object> deleteUser(@PathVariable Long id) {
        Map<String, Object> result = new HashMap<>();
        try {
            int rows = userService.deleteUser(id);
            if (rows > 0) {
                result.put("success", true);
                result.put("message", "用户删除成功");
            } else {
                result.put("success", false);
                result.put("message", "用户删除失败");
            }
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "用户删除失败: " + e.getMessage());
        }
        return result;
    }
}