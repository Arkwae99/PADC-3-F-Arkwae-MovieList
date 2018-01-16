package com.padcmyanmar.movielist.network.responses;

import com.google.gson.annotations.SerializedName;
import com.padcmyanmar.movielist.data.vo.PopularMoviesVO;

import java.util.List;

/**
 * Created by Ag Phone Khant on 2/1/2018.
 */

public class GetMoviesResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    @SerializedName("popular-movies")
    private List<PopularMoviesVO> popularMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<PopularMoviesVO> getPopularMovies() {
        return popularMovies;
    }
}
