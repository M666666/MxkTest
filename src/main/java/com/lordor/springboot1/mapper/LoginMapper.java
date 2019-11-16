package com.lordor.springboot1.mapper;

import com.lordor.springboot1.entity.Login;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface LoginMapper {

    //用户登录
    //登录
    @Select("select * from login where username=#{username} and password=#{password}")
    Login loginOn(@Param("username") String username,@Param("password") String password);

    //全查
    @Select("select * from login")
    List<Login> loginAll();

    //删除用户
    @Delete("delete from login where loginId = #{loginId}")
    int delLoginById(Integer id);

    //单查用户
    @Select("select * from login where loginId = #{loginId}")
    Login LoginById(Integer id);

    //添加用户
    @Options(useGeneratedKeys = true,keyProperty = "loginId")
    @Insert("insert into login(username,password,createTime) values(#{username},#{password},#{createTime})")
    int addLogin(Login login);

    //修改用户
    @Update("update login set username=#{username},password=#{password}  where loginId=#{loginId} ")
    int updateLogin(Login login);
}
