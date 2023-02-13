package com.swpu.service.impl;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.service.impl
 */

import com.swpu.entity.Comment;
import com.swpu.entity.Movie;
import com.swpu.mapper.MovieMapper;
import com.swpu.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieMapper movieMapper;
    @Override
    public List<Movie> getMovieByStatus(Integer Status) {
        List<Movie> movieList = movieMapper.getMovieByStatus(Status);
        movieList = movieList.stream().map((movie)->{
            // 处理导演
            String[] directors = movie.getDirector().split(",");
            if(directors.length!=0){
                movie.setDirector(directors[0]);
            }
            // 处理演员
            String[] actors = movie.getActor().split(",");
            StringBuffer actor = new StringBuffer();
            if(actors.length > 5){
                for(int i = 0;i < 5;i++){
                    if(i != 4){
                        actor.append(actors[i] + "/");
                    }else{
                        actor.append(actors[i]);
                    }
                }
            }else{
                for (int i = 0;i < actors.length;i++) {
                    if(i != actors.length - 1){
                        actor.append(actors[i] + "/");
                    }else{
                        actor.append(actors[i]);
                    }
                }
            }
            // 处理电影类型
            String[] types = movie.getTypes().split(",");
            StringBuffer type = new StringBuffer();
            for(int i = 0;i < types.length;i++){
                if(i != types.length - 1){
                    type.append(types[i] + "/");
                }else{
                    type.append(types[i]);
                }
            }
            movie.setTypes(type.toString());
            movie.setActor(actor.toString());
            return movie;
        }).collect(Collectors.toList());

        return movieList;
    }

    @Override
    public List<Movie> getPopularMovie() {
        List<Movie> movieList=movieMapper.getPopularMovie();
        movieList = movieList.stream().map((movie)->{
            // 处理导演
            String[] directors = movie.getDirector().split(",");
            if(directors.length!=0){
                movie.setDirector(directors[0]);
            }
            // 处理演员
            String[] actors = movie.getActor().split(",");
            StringBuffer actor = new StringBuffer();
            if(actors.length > 5){
                for(int i = 0;i < 5;i++){
                    if(i != 4){
                        actor.append(actors[i] + "/");
                    }else{
                        actor.append(actors[i]);
                    }
                }
            }else{
                for (int i = 0;i < actors.length;i++) {
                    if(i != actors.length - 1){
                        actor.append(actors[i] + "/");
                    }else{
                        actor.append(actors[i]);
                    }
                }
            }
            // 处理电影类型
            String[] types = movie.getTypes().split(",");
            StringBuffer type = new StringBuffer();
            for(int i = 0;i < types.length;i++){
                if(i != types.length - 1){
                    type.append(types[i] + "/");
                }else{
                    type.append(types[i]);
                }
            }
            movie.setTypes(type.toString());
            movie.setActor(actor.toString());
            return movie;
        }).collect(Collectors.toList());


        System.out.println("getPopularMovie");
        return movieList;
    }

    @Override
    public List<Movie> searchMovie(String param) {
        List<Movie> movieList=movieMapper.searchMovie(param);
        movieList = movieList.stream().map((movie)->{
            // 处理导演
            String[] directors = movie.getDirector().split(",");
            if(directors.length!=0){
                movie.setDirector(directors[0]);
            }
            // 处理演员
            String[] actors = movie.getActor().split(",");
            StringBuffer actor = new StringBuffer();
            if(actors.length > 5){
                for(int i = 0;i < 5;i++){
                    if(i != 4){
                        actor.append(actors[i] + "/");
                    }else{
                        actor.append(actors[i]);
                    }
                }
            }else{
                for (int i = 0;i < actors.length;i++) {
                    if(i != actors.length - 1){
                        actor.append(actors[i] + "/");
                    }else{
                        actor.append(actors[i]);
                    }
                }
            }
            // 处理电影类型
            String[] types = movie.getTypes().split(",");
            StringBuffer type = new StringBuffer();
            for(int i = 0;i < types.length;i++){
                if(i != types.length - 1){
                    type.append(types[i] + "/");
                }else{
                    type.append(types[i]);
                }
            }
            movie.setTypes(type.toString());
            movie.setActor(actor.toString());
            return movie;
        }).collect(Collectors.toList());

        return movieList;
    }

    @Override
    public List<Comment> getDetailById(Long movieId) {
        List<Comment> commentList=movieMapper.getDetailById(movieId);
        return commentList;
    }


}
