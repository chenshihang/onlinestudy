package org.wingstudio.service;

import org.wingstudio.entity.Comment;

import java.util.List;

/**
 * CommentService
 * create by chenshihang on 2018/7/29
 */
public interface CommentService {


    List<Comment> getCommentByVideoId(int videoId);


    boolean addOneComment(String commentText,int stuId,int videoId);






}
