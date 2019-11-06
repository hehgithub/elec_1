package com.wlwaq.elec_2.mapper;

import com.wlwaq.elec_2.bean.regDev;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface RegDevMapper {
    @Select("select * from device_information")
    List<regDev> list();

    @Select("select count(device_type) from device_information where device_type='IP Camera' and permit='allow'")
    Integer ipCount();

    @Select("select count(device_type) from device_information where device_type='温度传感器' and permit='allow'")
    Integer wdCount();

    @Select("select count(device_type) from device_information where device_type='电流传感器' and permit='allow'")
    Integer dlCount();

    @Select("select count(device_type) from device_information where device_type='IP Camera' and permit='not'")
    Integer ip1Count();

    @Select("select count(device_type) from device_information where device_type='温度传感器' and permit='not'")
    Integer wd1Count();

    @Select("select count(device_type) from device_information where device_type='电流传感器' and permit='not'")
    Integer dl1Count();


}
