package com.kyel.controller;

import com.kyel.entity.Admin;
import com.kyel.entity.Beauty;
import com.kyel.mapper.AdminMapper;
import com.kyel.service.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * @author jiewang
 */
@Controller
public class TableController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    BeautyService beautyService;

    @ResponseBody
    @GetMapping("/beautys")
    public List<Beauty> getBeautys(){
        List<Beauty> list = beautyService.list();
        return list;
    }

    @ResponseBody
    @GetMapping("/admin")
    public Admin getAdmin(@RequestParam("id") Long id){
        Admin admin = adminMapper.selectAdminById(id);
        return admin;
    }

    @ResponseBody
    @GetMapping("/admin/{username}")
    public Admin getAdminByName(@PathVariable("username") String username){
        Admin admin = adminMapper.getAdminByName(username);
        return admin;
    }

    @ResponseBody
    @GetMapping("/sql")
    public String sql(){
        String sql = "select * from boys";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map.get("boyName"));
        }
        System.out.println(dataSource.getClass());
        return "查询成功";
    }

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
