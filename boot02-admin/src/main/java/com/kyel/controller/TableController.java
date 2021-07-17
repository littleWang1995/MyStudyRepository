package com.kyel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jiewang
 */
@Controller
public class TableController {
    @GetMapping("/basic_table")
    public String basetable(){
        return "/table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(){
        return "/table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "/table/editable_table";
    }

    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "/table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "/table/responsive_table";
    }
}
