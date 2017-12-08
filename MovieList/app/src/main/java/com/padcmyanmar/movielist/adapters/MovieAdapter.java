package com.padcmyanmar.movielist.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.viewholders.MyViewHolder;
/**
 * Created by Ag Phone Khant on 8/12/2017.
 */
public class MovieAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View newsItemView=layoutInflater.inflate(R.layout.item_movies,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(newsItemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
