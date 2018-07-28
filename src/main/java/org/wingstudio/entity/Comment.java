package org.wingstudio.entity;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer videoId;

    private Integer stuId;

    private Integer parentId;

    private String content;

    private Date createTime;

    public Comment(Integer id, Integer videoId, Integer stuId, Integer parentId, String content, Date createTime) {
        this.id = id;
        this.videoId = videoId;
        this.stuId = stuId;
        this.parentId = parentId;
        this.content = content;
        this.createTime = createTime;
    }

    public Comment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}