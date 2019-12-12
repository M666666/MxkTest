package com.lordor.springboot1.mapper;

import com.lordor.springboot1.entity.LogoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("logoMapper")
public interface LogoMapper {

    //根据当前登录用户 获取当前ip 和姓名 添加到logo表
    @Insert("insert into logo(ip,username) values (#{ip},#{username})")
    int addLogo(@Param("username") String username,@Param("ip") String ip);

    //日志全查
    @Select("select * from logo")
    List<LogoEntity> listAll();
}
