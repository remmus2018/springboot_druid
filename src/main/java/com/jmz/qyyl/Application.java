package com.jmz.qyyl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot
 *
 * Created by 袁宗宇 on 18/01/03.
 */
@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
@MapperScan(basePackages = "com.jmz.qyyl.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
