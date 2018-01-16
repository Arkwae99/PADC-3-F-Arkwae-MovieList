package com.padcmyanmar.movielist.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.data.vo.PopularMoviesVO;
import com.padcmyanmar.movielist.delegates.MoviesActionDelegate;
import com.padcmyanmar.movielist.viewholders.MovieViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ag Phone Khant on 8/12/2017.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    private MoviesActionDelegate mMoviesActionDelegate;
    private List<PopularMoviesVO> mMoviesList;

    public MovieAdapter(MoviesActionDelegate moviesActionDelegate) {
        mMoviesActionDelegate = moviesActionDelegate;
        mMoviesList = new ArrayList<>();
    }
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View newsItemView=layoutInflater.inflate(R.layout.item_movies,parent,false);
        MovieViewHolder movieViewHolder =new MovieViewHolder(newsItemView,mMoviesActionDelegate);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.setMovies(mMoviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mMoviesList.size();
    }
    public void setMovies(List<PopularMoviesVO> moviesList){
        mMoviesList = moviesList;
        notifyDataSetChanged();
    }
}
