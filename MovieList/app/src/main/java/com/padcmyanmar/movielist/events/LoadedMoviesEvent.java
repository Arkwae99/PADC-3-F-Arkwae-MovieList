package com.padcmyanmar.movielist.events;

import com.padcmyanmar.movielist.data.vo.PopularMoviesVO;

import java.util.List;

/**
 * Created by Ag Phone Khant on 2/1/2018.
 */

public class LoadedMoviesEvent {
    private List<PopularMoviesVO> MoviesList;

    public List<PopularMoviesVO> getMoviesList() {
        return MoviesList;
    }

    public LoadedMoviesEvent(List<PopularMoviesVO> moviesList) {
        this.MoviesList = moviesList;

    }
}
