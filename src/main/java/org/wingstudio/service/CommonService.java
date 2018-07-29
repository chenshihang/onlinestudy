package org.wingstudio.service;

import org.wingstudio.entity.Student;

import javax.servlet.http.HttpServletRequest;

/**
 * CommonService
 * create by chenshihang on 2018/7/29
 */
public interface CommonService {



    boolean guestIsOnline(HttpServletRequest request);

    void addGuest(HttpServletRequest request);
}
