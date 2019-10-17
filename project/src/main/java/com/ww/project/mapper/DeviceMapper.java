package com.ww.project.mapper;

import com.ww.project.bean.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceMapper {
    Device getDevById(Integer id);
    List<Device> list();
    Integer devCount();
    Integer devvCount();
    Integer wdCount();
    Integer dlCount();
    Integer routerCount();
    Integer ipCount();
    Integer wd1Count();
    Integer dl1Count();
    Integer router1Count();
    Integer ip1Count();
}
