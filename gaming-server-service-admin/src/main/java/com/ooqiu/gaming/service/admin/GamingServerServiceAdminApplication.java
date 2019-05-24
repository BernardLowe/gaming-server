package com.ooqiu.gaming.service.admin;


import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 16:19 2019/5/10
 * @Modified By: BernardLowe
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.ooqiu.gaming.service.admin.mapper")
public class GamingServerServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(GamingServerServiceAdminApplication.class,args);
        Main.main(args);
    }
}
