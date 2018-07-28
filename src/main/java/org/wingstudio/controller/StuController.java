package org.wingstudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.wingstudio.entity.Category;
import org.wingstudio.entity.Video;
import org.wingstudio.service.CategoryService;
import org.wingstudio.service.VideoService;

import java.util.ArrayList;
import java.util.List;

/**
 * StuController
 * create by chenshihang on 2018/7/28
 */
@Controller
public class StuController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private VideoService videoService;

    @RequestMapping("/to_index22")
    public ModelAndView toIndex(){
        ModelAndView modelAndView = new ModelAndView();
        List<Category> categories = categoryService.getCategories();

        List<Integer> categoryIds =  new ArrayList<>();
        for(Category category: categories){
            categoryIds.add(category.getId());
        }
        List<List<Video>> videos = videoService.getVideosByCategory(categoryIds);

        modelAndView.addObject("videos",videos);
        modelAndView.addObject("categories",categories);

        for(Integer categoryId: categoryIds){
            System.out.println(categoryId+"--------------categoryId---------------");
        }
        modelAndView.setViewName("/student/index_test");

        return modelAndView;
    }


}
