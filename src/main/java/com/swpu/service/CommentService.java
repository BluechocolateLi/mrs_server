package com.swpu.service;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.service
 */

import com.swpu.entity.Comment;

import java.util.List;

public interface CommentService {
    //所有影评
    public List<Comment> getAllComment();

    //根据电影id查找影评
    public List<Comment> getCommentById(Long movieId);
    //写影评
    public int writeComment(Comment comment);
}
