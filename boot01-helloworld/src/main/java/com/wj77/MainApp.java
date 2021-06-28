package com.wj77;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBootApplication:声明这是一个Springboot项目
 * @author jiewang
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApp.class, args);
        Object user01 = run.getBean("pet01");
        System.out.println(user01);
    }
}
