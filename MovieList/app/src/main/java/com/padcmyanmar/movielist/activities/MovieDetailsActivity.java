package com.padcmyanmar.movielist.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.adapters.TrailersAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ag Phone Khant on 15/12/2017.
 */

public class MovieDetailsActivity extends AppCompatActivity {
    @BindView(R.id.rv_movie_trailers)
    RecyclerView rvTrailers;
    private TrailersAdapter TrailersAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);

        ButterKnife.bind(this,this);

        TrailersAdapter =new TrailersAdapter();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvTrailers.setLayoutManager(linearLayoutManager);
        rvTrailers.setAdapter(TrailersAdapter);

    }
}

