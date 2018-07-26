package org.wingstudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * VideoController
 * create by chenshihang on 2018/7/26
 */
@Controller
public class VideoController {


    @RequestMapping("/to_upload_page")
    public String toUploadPage(){
        return "WEB-INF/pages/video_upload";
    }


    @RequestMapping("do_video_upload")
    public String uploadVideo(MultipartFile video_file, String title, String introduction, HttpServletRequest request) throws IOException {
        System.out.println(title);
        System.out.println(introduction);
        System.out.println("size:"+video_file.getSize());
        String path = request.getSession().getServletContext().getRealPath("static/videos");
        String[] strings = video_file.getOriginalFilename().split("\\.");
        String videoPath = new StringBuilder(String.valueOf(new Date().getTime())).append(".").append(strings[1]).toString();
        System.out.println("fileName :"+videoPath+" path ="+path);
        File file = new File(path,videoPath);
        if(!file.exists()){
            file.mkdirs();
        }
        video_file.transferTo(file);
        System.out.println("-----------------");
        System.out.println(request.getContextPath());
        return "video_test";
    }
}
