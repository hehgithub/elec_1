package com.wlwaq.elec_2.mapper;

import com.wlwaq.elec_2.bean.Socket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TransMapper {
    @Select("select * from socket")
    List<Socket> list();
}
