package com.swpu.mapper;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.mapper
 */

import com.swpu.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MovieMapper {
    public List<Movie> getMovieByStatus(Integer status);
}
