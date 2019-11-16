package com.lordor.springboot1.controller;

import com.lordor.springboot1.Util.IpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    /**
     * 测试类
     * @return
     */

    @ResponseBody
    @RequestMapping("/index")
    public String Test() {
        return "登录成功";
    }

    //获取id地址测试
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request) {
        //获取IP地址
        String ipAddress = IpUtil.getIpAddr(request);
        System.out.println("这是ip....." + ipAddress);
        return "index";
    }
}
