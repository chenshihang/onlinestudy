package org.wingstudio.service;

import org.wingstudio.entity.Student;
import org.wingstudio.entity.Video;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * StudentService
 * create by chenshihang on 2018/7/29
 */
public interface StudentService {

    Student isOnline(HttpServletRequest request);

    Student doLogin(int stuNum ,String password);


    List<Video> getCollections(int stuId);






}
