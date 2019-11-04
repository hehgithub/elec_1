package com.ww.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface OnlineMapper {
    Date getOnline(@Param("iden_id") String iden_id);
}
