package org.wingstudio.entity;

import java.util.Date;

public class Video {
    private Integer id;

    private String title;

    private Integer categoryId;

    private String introduction;

    private String imgSrc;

    private String path;

    private Integer size;

    private Integer viewAmount;

    private Integer likeAmount;

    private Integer commentAmount;

    private Integer collectAmount;

    private Date createTime;

    public Video(Integer id, String title, Integer categoryId, String introduction, String imgSrc, String path, Integer size, Integer viewAmount, Integer likeAmount, Integer commentAmount, Integer collectAmount, Date createTime) {
        this.id = id;
        this.title = title;
        this.categoryId = categoryId;
        this.introduction = introduction;
        this.imgSrc = imgSrc;
        this.path = path;
        this.size = size;
        this.viewAmount = viewAmount;
        this.likeAmount = likeAmount;
        this.commentAmount = commentAmount;
        this.collectAmount = collectAmount;
        this.createTime = createTime;
    }

    public Video() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc == null ? null : imgSrc.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getViewAmount() {
        return viewAmount;
    }

    public void setViewAmount(Integer viewAmount) {
        this.viewAmount = viewAmount;
    }

    public Integer getLikeAmount() {
        return likeAmount;
    }

    public void setLikeAmount(Integer likeAmount) {
        this.likeAmount = likeAmount;
    }

    public Integer getCommentAmount() {
        return commentAmount;
    }

    public void setCommentAmount(Integer commentAmount) {
        this.commentAmount = commentAmount;
    }

    public Integer getCollectAmount() {
        return collectAmount;
    }

    public void setCollectAmount(Integer collectAmount) {
        this.collectAmount = collectAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}