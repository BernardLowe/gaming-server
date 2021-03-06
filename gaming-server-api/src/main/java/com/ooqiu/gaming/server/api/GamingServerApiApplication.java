package com.ooqiu.gaming.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 15:26 2019/5/16
 * @Modified By: BernardLowe
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableSwagger2
public class GamingServerApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(GamingServerApiApplication.class,args);
    }
}
