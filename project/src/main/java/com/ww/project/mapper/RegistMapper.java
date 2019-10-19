package com.ww.project.mapper;

import com.ww.project.bean.Regist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistMapper {
    Regist getNewRegist();
}
