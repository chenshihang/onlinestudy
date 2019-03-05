package org.wingstudio.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wingstudio.dao.CategoryMapper;
import org.wingstudio.dao.TestMapper;
import org.wingstudio.entity.Category;
import org.wingstudio.entity.Test;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Testcontroller
 * create by chenshihang on 2018/7/23
 */
@Controller
public class Testcontroller {

    Logger logger = LoggerFactory.getLogger(Testcontroller.class);


    @Autowired
    private TestMapper testMapper;

    @Autowired
    private CategoryMapper categoryMapper;


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


    @RequestMapping("/page_test")
    public String pageTest(){
        PageHelper.startPage(1, 1);


        List<Category> categoryList = categoryMapper.getCategories();
        PageInfo<Category> pageInfo = new PageInfo<>(categoryList);

        return "/student/error";
    }



}
