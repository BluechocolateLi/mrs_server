package com.swpu.controller;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.controller
 */

import com.swpu.entity.Comment;
import com.swpu.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/commentController")
public class CommentController {

    @Resource
    private CommentService commentService;

    @GetMapping("/getAllComment")
    public List<Comment> getAllComment(){
        return commentService.getAllComment();
    }
    @GetMapping("/getCommentById/{movieId}")
    public List<Comment> getCommentById(@PathVariable("movieId") Long movieId){
        System.out.println("getCommentById");
        return commentService.getCommentById(movieId);
    }
    @PostMapping("/writeComment")
    public int writeComment(Comment comment){
        return commentService.writeComment(comment);
    }



}
