package com.swpu.service.impl;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.service.impl
 */

import com.swpu.entity.Movie;
import com.swpu.mapper.MovieMapper;
import com.swpu.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieMapper movieMapper;
    @Override
    public List<Movie> getMovieByStatus(Integer Status) {
        List<Movie> movieList = movieMapper.getMovieByStatus(Status);
        movieList = movieList.stream().map((item) -> {
            double score = item.getScore() / 2;
            item.setScore((double)Math.round(score*10)/10);
            return item;
        }).collect(Collectors.toList());
        return movieList;
    }
}
