# Spring Boot 项目 - spring_wenhao

这是一个基于Spring Boot的Web应用项目，包含以下技术栈：

## 技术栈

- **Spring Boot 3.2.0** - 主框架
- **Spring MVC** - Web层框架
- **MyBatis 3.0.3** - 持久层框架
- **MySQL Connector** - 数据库驱动
- **Maven** - 项目构建工具
- **Java 17** - 编程语言

## 项目结构

```
src/
├── main/
│   ├── java/com/wenhao/springwenhao/
│   │   ├── SpringWenhaoApplication.java    # 主启动类
│   │   ├── controller/                     # 控制器层
│   │   │   ├── HomeController.java         # 首页控制器
│   │   │   └── UserController.java         # 用户控制器
│   │   ├── service/                        # 服务层
│   │   │   └── UserService.java            # 用户服务
│   │   ├── mapper/                         # 数据访问层
│   │   │   └── UserMapper.java             # 用户Mapper接口
│   │   ├── entity/                         # 实体类
│   │   │   └── User.java                   # 用户实体
│   │   └── config/                         # 配置类
│   │       └── MyBatisConfig.java          # MyBatis配置
│   └── resources/
│       ├── application.properties          # 应用配置
│       ├── mapper/                         # MyBatis XML文件
│       │   └── UserMapper.xml              # 用户Mapper XML
│       └── schema.sql                      # 数据库初始化脚本
└── test/
    └── java/com/wenhao/springwenhao/
        └── SpringWenhaoApplicationTests.java # 测试类
```

## 功能特性

- RESTful API设计
- 用户CRUD操作
- MyBatis集成（注解+XML方式）
- MySQL数据库连接
- 统一返回格式
- 异常处理

## 快速开始

### 1. 环境要求

- Java 17+
- Maven 3.6+
- MySQL 8.0+

### 2. 数据库配置

创建数据库并运行初始化脚本：

```sql
-- 运行 src/main/resources/schema.sql 中的脚本
```

### 3. 配置数据库连接

修改 `src/main/resources/application.properties` 中的数据库连接信息：

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring_wenhao?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 4. 运行项目

```bash
# 编译项目
mvn clean compile

# 运行测试
mvn test

# 启动应用
mvn spring-boot:run
```

### 5. 访问应用

应用启动后，访问以下地址：

- 首页：http://localhost:8080/
- 健康检查：http://localhost:8080/health
- 用户API：http://localhost:8080/api/users

## API文档

### 用户管理 API

- `GET /api/users` - 获取所有用户
- `GET /api/users/{id}` - 根据ID获取用户
- `POST /api/users` - 创建用户
- `PUT /api/users/{id}` - 更新用户
- `DELETE /api/users/{id}` - 删除用户

### 示例请求

创建用户：
```json
POST /api/users
{
    "username": "张三",
    "email": "zhangsan@example.com",
    "password": "password123"
}
```

### 响应格式

```json
{
    "success": true,
    "data": {...},
    "message": "操作成功"
}
```

## 开发说明

本项目是一个Spring Boot学习项目，展示了如何集成Spring MVC、MyBatis和MySQL，适合Java Web开发学习和参考。
