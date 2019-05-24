package com.ooqiu.gaming.server.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 14:45 2019/5/13
 * @Modified By: BernardLowe
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GamingServerWebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(GamingServerWebAdminApplication.class,args);
    }
}
