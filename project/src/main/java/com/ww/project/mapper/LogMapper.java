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
}
