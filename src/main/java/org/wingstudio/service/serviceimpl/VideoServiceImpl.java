package org.wingstudio.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wingstudio.dao.VideoMapper;
import org.wingstudio.entity.Video;
import org.wingstudio.service.VideoService;

import java.util.ArrayList;
import java.util.List;

/**
 * VideoServiceImpl
 * create by chenshihang on 2018/7/28
 */
@Service
public class VideoServiceImpl implements VideoService {



    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<List<Video>> getVideosByCategory(List<Integer> categoryIds) {

        List<List<Video>> result = new ArrayList<>();
        for(Integer categoryId:categoryIds){
            List<Video> videos = videoMapper.getVideosByCategoryId(categoryId);
            result.add(videos);
        }
        return result;
    }
}
