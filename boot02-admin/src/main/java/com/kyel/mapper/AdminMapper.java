package com.kyel.mapper;

import com.kyel.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jiewang
 */
@Mapper
public interface AdminMapper {
    public Admin selectAdminById(Long id);
}
