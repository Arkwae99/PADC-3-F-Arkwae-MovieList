package com.padcmyanmar.movielist.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.delegates.MoviesActionDelegate;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ag Phone Khant on 8/12/2017.
 */


public class MovieViewHolder extends RecyclerView.ViewHolder{
    private MoviesActionDelegate mMoviesActionDelegate;
    public MovieViewHolder(View itemView, MoviesActionDelegate moviesActionDelegate) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mMoviesActionDelegate = moviesActionDelegate;

    }
    @OnClick(R.id.cv_movie)
    public void onMoviesTap(View view){
        mMoviesActionDelegate.onTapMovies();
    }
}
