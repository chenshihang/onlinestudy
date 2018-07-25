package org.wingstudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wingstudio.dao.TestMapper;
import org.wingstudio.entity.Test;

import javax.annotation.Resource;

/**
 * Testcontroller
 * create by chenshihang on 2018/7/22
 */
@Controller
public class Testcontroller {

    @Autowired
    private TestMapper testMapper;



    @RequestMapping("/to_index")
    public String    test1(){

        testMapper.insert(new Test("xiaoming"));


        return "/index";
    }
}
