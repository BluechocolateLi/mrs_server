package com.swpu.service;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.service
 */

import com.swpu.entity.Movie;

import java.util.List;

public interface MovieService {

    public List<Movie> getMovieByStatus(Integer Status);
}
