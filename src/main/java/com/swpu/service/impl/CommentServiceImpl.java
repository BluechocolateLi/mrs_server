package com.swpu.service.impl;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.service.impl
 */

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.swpu.entity.Comment;
import com.swpu.mapper.CommentMapper;
import com.swpu.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;
    @Override
    public List<Comment> getAllComment() {
        List<Comment> commentList=commentMapper.getAllComment();
        commentList=commentList.stream().map(comment -> {
            DateTime date = DateUtil.date();
            comment.setCreateTime(date.toTimestamp());
            comment.setUpdateTime(date.toTimestamp());
            return comment;

        }).collect(Collectors.toList());
        return commentList;
    }

    @Override
    public List<Comment> getCommentById(Long movieId) {
        List<Comment> commentList=commentMapper.getCommentById(movieId);
        return commentList;
    }

    @Override
    public int writeComment(Comment comment) {
        DateTime date = DateUtil.date();
        comment.setCreateTime(date.toTimestamp());
        comment.setUpdateTime(date.toTimestamp());
        int res=commentMapper.writeComment(comment);
        return res;
    }
}
