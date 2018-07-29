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

    @Override
    public List<Video> getRecentVideos() {
        List<Video> result = new ArrayList<>();
        Video video = new Video();
        video.setId(444);
        video.setTitle("service测试专用1");
        video.setImgSrc("/static/img/img1.jpg");
        Video video2 = new Video();
        video2.setId(4445);
        video2.setImgSrc("/static/img/img1.jpg");
        video2.setTitle("service测试专用12");
        result.add(video);
        result.add(video2);
        return result;
    }

    @Override
    public List<Video> getVideoByCategoryId(int categoryId) {
        return null;
    }
}
