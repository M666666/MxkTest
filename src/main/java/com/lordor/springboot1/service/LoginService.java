package com.lordor.springboot1.service;

import com.lordor.springboot1.entity.Login;
import com.lordor.springboot1.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    LoginMapper loginMapper;

    //登录
    public Login loginOn(String username, String password)
    {
        return loginMapper.loginOn(username,password);
    }

    //全查
    public List<Login> loginAll()
    {
        return loginMapper.loginAll();
    }

    //删除用户
    public int delLoginById(Integer id)
    {
        return loginMapper.delLoginById(id);
    }
    //删除用户
    public Login LoginById(Integer id)
    {
        return loginMapper.LoginById(id);
    }

    //添加用户
    public int addLogin(Login login)
    {
        return loginMapper.addLogin(login);
    }

    //修改用户
    public int updateLogin(Login login)
    {
        return loginMapper.updateLogin(login);
    }
}
