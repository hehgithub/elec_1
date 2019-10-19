package com.ww.project.mapper;

import com.ww.project.bean.Socket;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SocketMapper {
    Socket getNewSocket();
}
