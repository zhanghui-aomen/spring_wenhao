-- 数据库初始化脚本
-- 创建数据库
CREATE DATABASE IF NOT EXISTS spring_wenhao CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE spring_wenhao;

-- 创建用户表
CREATE TABLE IF NOT EXISTS users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '用户ID',
    username VARCHAR(50) NOT NULL UNIQUE COMMENT '用户名',
    email VARCHAR(100) NOT NULL COMMENT '邮箱',
    password VARCHAR(255) NOT NULL COMMENT '密码',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户表';

-- 插入测试数据
INSERT INTO users (username, email, password) VALUES 
('张三', 'zhangsan@example.com', 'password123'),
('李四', 'lisi@example.com', 'password123'),
('王五', 'wangwu@example.com', 'password123')
ON DUPLICATE KEY UPDATE username=VALUES(username);