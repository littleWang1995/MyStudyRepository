package com.kyel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author jiewang
 */
@TableName("beauty")
@Data
public class Beauty {
    private Long id;
    private String name;
    private String sex;
    private String borndate;
    private String phone;
    private String photo;
    private Long boyfriend_id;
}
