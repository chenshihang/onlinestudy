package org.wingstudio.service;

import org.wingstudio.entity.Video;

import java.util.List;

/**
 * VideoService
 * create by chenshihang on 2018/7/28
 */
public interface VideoService {

    List<List<Video>> getVideosByCategory(List<Integer> categoryIds);


}
