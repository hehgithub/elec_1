package com.wlwaq.elec_2.mapper;

import com.wlwaq.elec_2.bean.log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LogMapper {

    @Select("select * from logback where id=#{id}")
    log getLogById(Integer id);

    @Select("select * from logback")
    List<log> list();

    @Select("select count(*) from logback")
    Integer allCount();

    @Select("select count(type) from logback where type='假冒攻击'")
    Integer jmCount();

    @Select("select count(type) from logback where type='重放攻击'")
    Integer cfConut();

    @Select("select count(type) from logback where type='中间人攻击'")
    Integer zjrConut();
}
