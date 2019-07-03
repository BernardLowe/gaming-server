# gaming-server
基于Spring Boot + Dubbo + Zookeeper的游戏新闻服务平台（系统架构）

# 项目简介
## 开发环境

* 操作系统：Windows 10
* 开发工具：Intellij IDEA
* 数据库：MySQL 5.7.22
* Java SDK：Oracle JDK 1.8.0_131

## 部署环境
* 操作系统：Linux centos7 x64
* 虚拟化技术：VMware + Docker

## 项目管理工具
* 项目构建：Maven + Nexus
* 代码管理：Git + GitLab
* 镜像管理：Docker Registry

## 后台主要技术栈

* 核心框架：Spring Boot
* 视图框架：Spring MVC
* 页面引擎：Thymeleaf
* ORM 框架：tk.mybatis 简化 MyBatis 开发
* 数据库连接池：Alibaba Druid
* 数据库缓存：Redis
* 全文检索：使用基于 Lucence 的全文检索引擎 Solr 为整个系统提供搜索服务
* 接口文档引擎：Swagger2 RESTful 风格 API 文档生成
* 容器化引擎：使用 Docker 为容器化引擎并配合 Docker Compose 管理容器
* RPC 通信：基于 RPC 通信协议的 Dubbo 为主要通信框架。由于使用的是开源版本，所以其中的
* 服务治理：Zookeeper 
* 反向代理负载均衡：Nginx
* CDN服务器：基于Nginx搭建


## 前端主要技术栈
* 前端框架：Bootstrap + jQuery
* 前端模板：metronic
