package com.lordor.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
}
