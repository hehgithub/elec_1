package com.ww.project.mapper;

import com.ww.project.bean.If;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IfMapper {
    If getNewIf();
}
