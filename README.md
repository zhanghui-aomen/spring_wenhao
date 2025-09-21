# spring_wenhao
练习Spring

## 项目描述
这是一个基于Spring Boot的Java练习项目，用于学习Spring框架的基本功能。

## 功能特点
- 基于Spring Boot 3.2.0
- RESTful API接口
- Maven构建工具
- 单元测试

## 快速开始

### 环境要求
- Java 17 或更高版本
- Maven 3.6 或更高版本

### 运行项目

1. 克隆项目
```bash
git clone https://github.com/zhanghui-aomen/spring_wenhao.git
cd spring_wenhao
```

2. 编译项目
```bash
mvn clean compile
```

3. 运行测试
```bash
mvn test
```

4. 启动应用
```bash
mvn spring-boot:run
```

应用将在 http://localhost:8080 启动

### API接口

- `GET /api/hello` - 返回简单的问候消息
- `GET /api/hello/{name}` - 返回个性化的问候消息
- `GET /api/info` - 返回应用信息

### 示例请求

```bash
# 基本问候
curl http://localhost:8080/api/hello

# 个性化问候
curl http://localhost:8080/api/hello/张三

# 应用信息
curl http://localhost:8080/api/info
```

## 项目结构

```
src/
├── main/
│   ├── java/
│   │   └── com/example/spring_wenhao/
│   │       ├── SpringWenhaoApplication.java    # 主应用类
│   │       └── controller/
│   │           └── HelloController.java        # REST控制器
│   └── resources/
│       └── application.properties              # 应用配置
└── test/
    └── java/
        └── com/example/spring_wenhao/
            ├── SpringWenhaoApplicationTests.java    # 应用测试
            └── controller/
                └── HelloControllerTest.java         # 控制器测试
```
