package com.lordor.springboot1.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lordor.springboot1.entity.LogoEntity;
import com.lordor.springboot1.service.LogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LogoController {

    /**
     * 日志表
     */
    @Autowired
    LogoService logoService;

    /**
     * 用户全查分页
     * @param model
     * @param pageNum
     * @return
     */
    @RequestMapping("/logoAll")
    public String getAllPerson(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<LogoEntity> list = logoService.listAll();
        PageInfo<LogoEntity> pageInfo = new PageInfo<LogoEntity>(list);
        model.addAttribute("pageInfo", pageInfo);
        System.out.println("分页全查....." + pageInfo);
        return "logoList";
    }

}
