package com.wj77.controller;

import com.wj77.bean.Car;
import com.wj77.bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ResponseBody 、@Controller在Springboot中被@RestController代替
 *
 * @author jiewang
 */
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car getPet(){
        return car;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello,spring boot 2!";
    }
}
