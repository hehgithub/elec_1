package com.wlwaq.elec_2.mapper;

import com.wlwaq.elec_2.bean.Identity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@Mapper
public interface IdentityMapper {
    @Select("select * from doidentity where ip=#{ip} and time=#{time}")
    Identity getRecord(@Param("ip") String ip, @Param("time") String time);
}
