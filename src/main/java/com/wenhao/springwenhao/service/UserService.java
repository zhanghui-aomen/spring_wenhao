package com.wenhao.springwenhao.service;

import com.wenhao.springwenhao.entity.User;
import com.wenhao.springwenhao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务类
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据ID查询用户
     */
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    /**
     * 查询所有用户
     */
    public List<User> findAll() {
        return userMapper.findAll();
    }

    /**
     * 根据用户名查询用户
     */
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    /**
     * 保存用户
     */
    public int saveUser(User user) {
        if (user.getId() == null) {
            return userMapper.insert(user);
        } else {
            return userMapper.update(user);
        }
    }

    /**
     * 删除用户
     */
    public int deleteUser(Long id) {
        return userMapper.deleteById(id);
    }
}