package com.wlwaq.elec_2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.wlwaq.elec_2.bean.RegRecord;
import java.util.Date;

@Mapper
public interface RegistMapper {
    @Select("select max(time) from regist where biaoshi=#{iden_id}")
    Date getRegTime(String iden_id);

    @Select("select * from regist WHERE biaoshi =#{iden_id} and time=(select max(time) from regist WHERE biaoshi = #{iden_id})")
    RegRecord getRecord(@Param("iden_id") String iden_id);
}
