package com.wlwaq.elec_2.mapper;

import com.wlwaq.elec_2.bean.Identity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IdentityMapper {
    @Select("select * from doidentity where id =(select max(id) from doidentity)")
    Identity getRecord();
}
