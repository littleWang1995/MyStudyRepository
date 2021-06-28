package com.wj77.config;

import com.wj77.bean.Car;
import com.wj77.bean.Pet;
import com.wj77.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jiewang
 */
@Configuration(proxyBeanMethods = true)
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    public User user01(){
        return new User("wangjie",26);
    }

    @Bean
    public Pet pet01(){
        Pet tom = new Pet("tom1");
        return tom;
    }

    @Bean
    public Pet pet02(){
        Pet tom = new Pet("tom2");
        return tom;
    }
}
