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

    @Update("update device_information set permit='allow' WHERE mac=#{mac}")
    void pass(String mac);

    @Update("update device_information set permit='cancel' WHERE mac=#{mac}")
    void logout(String mac);

    @Select("select count(id) from device_information")
    Integer devCount();

    @Select("select count(id) from device_information where permit = 'allow'")
    Integer regDevCount();

    @Select("select count(id) from device_information where device_type='温湿度传感器'")
    Integer wsdCount();

    @Select("select count(id) from device_information where device_type='电流传感器'")
    Integer dianliuCount();

    @Select("select count(id) from device_information where device_type='电压传感器'")
    Integer dyCount();

    @Select("select count(id) from device_information where device_type='烟雾传感器'")
    Integer ywCount();

    @Select("select count(id) from device_information where device_type='温湿度传感器' and permit='allow'")
    Integer wsdRegCount();

    @Select("select count(id) from device_information where device_type='电流传感器' and permit='allow'")
    Integer dianliuRegCount();

    @Select("select count(id) from device_information where device_type='电压传感器' and permit='allow'")
    Integer dyRegCount();

    @Select("select count(id) from device_information where device_type='烟雾传感器' and permit='allow'")
    Integer ywRegCount();

    @Select("select ip from device_information where iden_id=#{iden_id}")
    String getIp(String iden_id);
}
