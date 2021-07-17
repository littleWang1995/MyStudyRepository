package com.wj77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jiewang
 */
@Controller
public class ViewTestController {

    @GetMapping("/success")
    public String success(Model model){
        model.addAttribute("msg","哈哈");
        return "success";
    }
}
