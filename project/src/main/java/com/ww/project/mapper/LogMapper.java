package com.ww.project.mapper;

import com.ww.project.bean.log;
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

    @Select("select count(type) from logback where type='Dos攻击'")
    Integer dosCount();

    @Select("select count(type) from logback where type='重放攻击'")
    Integer cfConut();
}
