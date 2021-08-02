package com.kyel.mapper;

import com.kyel.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author jiewang
 */
//@Mapper
public interface AdminMapper {
    public Admin selectAdminById(Long id);

    @Select("select * from admin where username = #{name}")
    Admin getAdminByName(String name);
}
