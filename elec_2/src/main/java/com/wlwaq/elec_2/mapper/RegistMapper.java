package com.wlwaq.elec_2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@Mapper
public interface RegistMapper {
    @Select("select max(time) from regist where biaoshi=#{iden_id}")
    Date getRegTime(String iden_id);
}
