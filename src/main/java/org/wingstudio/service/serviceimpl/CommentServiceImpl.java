package org.wingstudio.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wingstudio.dao.CommentMapper;
import org.wingstudio.entity.Comment;
import org.wingstudio.service.CommentService;
import org.wingstudio.service.CommonService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * CommentServiceImpl
 * create by chenshihang on 2018/7/29
 */
@Service
public class CommentServiceImpl implements CommentService {


    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> getCommentByVideoId(int videoId) {
        return commentMapper.getCommentByVideoId(videoId);
    }

    @Override
    public boolean addOneComment(String commentText, int stuId, int videoId) {
        return false;
    }
}
