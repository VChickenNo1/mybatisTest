package com.cyy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.cyy.dao.IUserDao")
@SpringBootApplication(scanBasePackages="com.cyy")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
