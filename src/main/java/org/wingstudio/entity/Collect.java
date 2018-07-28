package org.wingstudio.entity;

import java.util.Date;

public class Collect {
    private Integer id;

    private Integer stuId;

    private Integer videoId;

    private Date createTime;

    public Collect(Integer id, Integer stuId, Integer videoId, Date createTime) {
        this.id = id;
        this.stuId = stuId;
        this.videoId = videoId;
        this.createTime = createTime;
    }

    public Collect() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}