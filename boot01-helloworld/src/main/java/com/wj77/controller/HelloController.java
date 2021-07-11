package com.wj77.controller;

import com.wj77.bean.Car;
import com.wj77.bean.Pet;
import com.wj77.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.Map;

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

//    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String postUser(){
        return "post提交user";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.PUT)
    public String putUser(@PathVariable("id") Integer id,
                          @RequestParam("name") String name,
                          @RequestHeader Map<String,String> headers,
                          @RequestBody Map<String,Object> param){
        System.out.println(param.get("name"));
        return "put提交user";
    }

    @RequestMapping("/saveUser")
    public User saveUser(User user){
        return  user;
    }

    @ResponseBody
    @RequestMapping("/getuser")
    public User getUser(){
        User user = new User();
        user.setAge(18);
        user.setUsername("王杰");
        return user;
    }
}
