package com.ww.project.mapper;

import com.ww.project.bean.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceMapper {
    public Device getDevById(Integer id);
    List<Device> list();
}
