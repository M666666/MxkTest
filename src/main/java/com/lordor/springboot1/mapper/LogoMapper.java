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

    @Insert("insert into logo(ip,username) values (#{ip},#{username})")
    int addLogo(@Param("username") String username,@Param("ip") String ip);

    @Select("select * from logo")
    List<LogoEntity> listAll();
}
