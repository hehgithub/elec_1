package com.wlwaq.elec_2.mapper;

import com.wlwaq.elec_2.bean.Socket;
import com.wlwaq.elec_2.bean.TempHumi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TransMapper {
    @Select("select * from socket")
    List<Socket> list();

    @Select("select ming,time from socket WHERE ming is not NULL AND ming!='' order by time desc limit 10")
    List<TempHumi> Tlist();
}
