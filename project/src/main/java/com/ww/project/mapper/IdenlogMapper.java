package com.ww.project.mapper;

import com.ww.project.bean.Idenlog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IdenlogMapper {
    List<Idenlog> list();
}
