package com.wlwaq.elec_2.mapper;

import com.wlwaq.elec_2.bean.IdenDev;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IdenDevMapper {
    @Select("select * from doidentity")
    List<IdenDev> list();
}
