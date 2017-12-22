package com.padcmyanmar.movielist.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.viewholders.MovieGenreViewHolder;


/**
 * Created by E5 on 12/21/2017.
 */

public class MovieGenreAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View movieGenre = layoutInflater.inflate(R.layout.item_movie_genre, parent, false);
        MovieGenreViewHolder movieGenreViewHolder = new MovieGenreViewHolder(movieGenre);
        return movieGenreViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
