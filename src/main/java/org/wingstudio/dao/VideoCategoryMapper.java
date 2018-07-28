package org.wingstudio.dao;

import org.wingstudio.entity.VideoCategory;

public interface VideoCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoCategory record);

    int insertSelective(VideoCategory record);

    VideoCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoCategory record);

    int updateByPrimaryKey(VideoCategory record);
}