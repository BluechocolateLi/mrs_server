package com.swpu.mapper;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.mapper
 */

import com.swpu.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    //所有影评
    public List<Comment> getAllComment();
    //根据电影id查找影评
    public List<Comment> getCommentById(Long movieId);
    //写影评
    public int writeComment(Comment comment);
}
