package com.lordor.springboot1.service;

import com.lordor.springboot1.entity.LogoEntity;
import com.lordor.springboot1.mapper.LogoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogoService {

    @Autowired
    LogoMapper logoMapper;

    //保存 用户名username 和 ip地址
    public int addLogo(String username,String ip)
    {
        return  logoMapper.addLogo(username,ip);
    }

    //用户全查
    public List<LogoEntity> listAll()
    {
        return logoMapper.listAll();
    }
}
