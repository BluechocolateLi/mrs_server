package com.swpu.mapper;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.mapper
 */

import com.swpu.entity.Comment;
import com.swpu.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MovieMapper {

    public List<Movie> getMovieByStatus(Integer status);
//热门电影
    public  List<Movie> getPopularMovie();
//搜索
    public List<Movie> searchMovie(String param);
//影片描述
    public List<Comment> getDetailById(Long movieId);




}
