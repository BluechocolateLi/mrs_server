package com.swpu.controller;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.controller
 */

import com.swpu.entity.Movie;
import com.swpu.service.MovieService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Resource
    private MovieService movieService;
    @GetMapping("/getMovieByStatus/{status}")
    public List<Movie> getMovieByStatus(@PathVariable("status") Integer status){
        return movieService.getMovieByStatus(status);
    }
}
