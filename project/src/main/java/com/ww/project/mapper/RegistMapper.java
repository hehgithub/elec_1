package com.ww.project.mapper;

import com.ww.project.bean.Regist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface RegistMapper {
    Regist getNewRegist();
    Date getTime(@Param("iden_id") String iden_id);
}
