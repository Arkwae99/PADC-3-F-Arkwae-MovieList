package com.padcmyanmar.movielist.data.models;

import com.padcmyanmar.movielist.network.HttpUrlConnectionDataAgent;
import com.padcmyanmar.movielist.network.MoviesDataAgent;

/**
 * Created by Ag Phone Khant on 2/1/2018.
 */

public class MoviesModel {
    private static MoviesModel sObjectInstance;
    private MoviesDataAgent mMoviesDataAgent;

    private MoviesModel(){
        mMoviesDataAgent = HttpUrlConnectionDataAgent.getsObjectInstance();
    }

    public static MoviesModel getsObjectInstance(){
        if(sObjectInstance == null){
            sObjectInstance = new MoviesModel();
        }
        return sObjectInstance;
    }

    /**
     * load news from network api.
     */
    public void loadMovies() {
        mMoviesDataAgent.loadMovies();
    }
}
