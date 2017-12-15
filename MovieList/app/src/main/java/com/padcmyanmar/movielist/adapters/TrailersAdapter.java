package com.padcmyanmar.movielist.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.viewholders.ItemTrailersViewHolder;

/**
 * Created by Ag Phone Khant on 15/12/2017.
 */

public class TrailersAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View traileritemsView = layoutInflater.inflate(R.layout.item_movie_trailers, parent, false);
        ItemTrailersViewHolder itemTrailersViewHolder = new ItemTrailersViewHolder(traileritemsView);
        return itemTrailersViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
