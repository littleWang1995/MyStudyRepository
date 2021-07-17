package com.kyel.controller;

import com.kyel.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author jiewang
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/","/login"})
    public String toLoginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session){
        String username = user.getUsername();
        String password = user.getPassword();
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("loginUser",user);
            return "redirect:/index";
        }else {
            model.addAttribute("msg","登录失败请重试");
            return "login";
        }
    }

    @GetMapping("/index")
    public String index(HttpSession session){
        System.out.println(session.getAttribute("loginUser"));
        return "index";
    }
}
