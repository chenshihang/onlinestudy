package org.wingstudio.dao;

import org.apache.ibatis.annotations.Param;
import org.wingstudio.entity.Video;

import java.util.List;

public interface VideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);


    List<Video> getVideosByCategoryId(Integer categoryId);

    List<Video> getRecentVideos();

    List<Video> getVideoByCategoryId(int categoryId);

    Video getVideoById(int videoId);

    int setViewAmount(@Param("videoId") int videoId, @Param("viewAmount") int viewAmount);

    List<Video> getCollectVideosByStuId(int stuId);
}