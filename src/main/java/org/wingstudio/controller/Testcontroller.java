package org.wingstudio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wingstudio.dao.TestMapper;
import org.wingstudio.entity.Test;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Testcontroller
 * create by chenshihang on 2018/7/23
 */
@Controller
public class Testcontroller {

    Logger logger = LoggerFactory.getLogger(Testcontroller.class);


    @Autowired
    private TestMapper testMapper;



    @RequestMapping("/to_indextt")
    public String    test1(HttpServletRequest request){

        String path = request.getSession().getServletContext().getRealPath("/static/videos/");
        System.out.println("----------------");
        System.out.println(path);
        System.out.println(request.getSession().getServletContext());
        testMapper.insert(new Test("xiaoming"));


        return "/index";
    }

    @RequestMapping("/to_index2")
    public String    test12(){

        logger.info("------------------------");
        System.out.println("==================");

        return "/index";
    }



}
