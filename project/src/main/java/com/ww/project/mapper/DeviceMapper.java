package com.ww.project.mapper;

import com.ww.project.bean.Device;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    void addDev(@Param("type") String type, @Param("brand") String brand,
                @Param("version") String version, @Param("mac") String mac, @Param("ip") String ip);
    void DelDev(@Param("mac") String mac);
    List<Device> register_dev();
    List<Device> online_dev();
    void DelRegDev(@Param("mac") String mac);
    void DelOnDev(@Param("mac") String mac);
}
