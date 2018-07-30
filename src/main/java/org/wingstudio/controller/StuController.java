package org.wingstudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.wingstudio.Common.Const;
import org.wingstudio.entity.Category;
import org.wingstudio.entity.Comment;
import org.wingstudio.entity.Student;
import org.wingstudio.entity.Video;
import org.wingstudio.service.*;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    private StudentService studentService;

    @Autowired
    private CommonService commonService;

    @Autowired
    private CommentService commentService;


    @RequestMapping("/do_login")
    public ModelAndView doLogin(HttpServletRequest request,String stuNum,String password){

        ModelAndView modelAndView = new ModelAndView();
        try {
            Integer.parseInt(stuNum);
        }catch (Exception e){
            modelAndView.setViewName("student/error");
            modelAndView.addObject("msg","学号或密码错误");
            return modelAndView;
        }

        Student student = studentService.doLogin(Integer.parseInt(stuNum),password);
        if(student==null){
            modelAndView.setViewName("student/error");
            modelAndView.addObject("msg","学号或密码错误");

        }else {
            request.getSession().setAttribute(Const.CURRENT_STU,student);
            modelAndView.setViewName("redirect:/to_index");

        }
        return modelAndView;
    }
    @RequestMapping("/to_index")
    public ModelAndView toIndex(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("/student/index");
        Student student = studentService.isOnline(request);
        if(student==null && !commonService.guestIsOnline(request)){
            commonService.addGuest(request);
        }
        List<Category> categories = categoryService.getCategories();
        List<Video> videos = videoService.getRecentVideos();
        modelAndView.addObject("categories",categories);
        modelAndView.addObject("videos",videos);
        return modelAndView;
    }

    @RequestMapping("/to_video_play")
    public ModelAndView toVideoPlay(HttpServletRequest request,int videoId){
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentService.isOnline(request);
        if(student==null){
            modelAndView.setViewName("student/need_login");
            modelAndView.addObject("msg","需要登录才能播放视频哟");
        }else {
            Video video = videoService.getVideoById(videoId);
            if(video==null){
                modelAndView.setViewName("student/error");
                modelAndView.addObject("msg","视频获取出错");
            }else {
                List<Comment> comments = commentService.getCommentByVideoId(videoId);
                List<Category> categories = categoryService.getCategories();
                videoService.setViewAmount(videoId,video.getViewAmount()+1);
                video.setViewAmount(video.getViewAmount()+1);
                modelAndView.addObject("categories",categories);
                modelAndView.addObject("video",video);
                modelAndView.addObject("comments",comments);
                modelAndView.setViewName("/student/video_play");
            }
        }
        return modelAndView;
    }


    @RequestMapping("/to_stu_info")
    public ModelAndView toMyInfo(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentService.isOnline(request);
        if(student==null){
            modelAndView.setViewName("student/need_login");
            modelAndView.addObject("msg","需要登录才能访问个人中心");
        }else {
            List<Video> videos = videoService.getCollectVideosByStuId(student.getId());
            modelAndView.addObject("videos",videos);
            modelAndView.setViewName("student/stu_info");
        }
        return modelAndView;
    }
}
