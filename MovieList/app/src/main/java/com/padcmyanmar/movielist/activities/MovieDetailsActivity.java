package com.padcmyanmar.movielist.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.adapters.MovieGenreAdapter;
import com.padcmyanmar.movielist.adapters.MovieReviewsAdapter;
import com.padcmyanmar.movielist.adapters.TrailersAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ag Phone Khant on 15/12/2017.
 */

public class MovieDetailsActivity extends AppCompatActivity {
    @BindView(R.id.rv_movie_trailers)
    RecyclerView rvTrailers;

    @BindView(R.id.rv_movie_genre)
    RecyclerView rvGenre;

    @BindView(R.id.rv_movie_reviews)
    RecyclerView rvReviews;

    private TrailersAdapter trailersAdapter;
    private MovieGenreAdapter movieGenreAdapter;
    private MovieReviewsAdapter movieReviewsAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);
//        TextView txtScroll = (TextView) findViewById(R.id.tv_movie_description_details);
//        txtScroll.setMovementMethod(new ScrollingMovementMethod());

        ButterKnife.bind(this, this);

        trailersAdapter = new TrailersAdapter();
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvTrailers.setLayoutManager(linearLayoutManager1);
        rvTrailers.setAdapter(trailersAdapter);

        movieGenreAdapter = new MovieGenreAdapter();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvGenre.setLayoutManager(linearLayoutManager2);
        rvGenre.setAdapter(movieGenreAdapter);

        movieReviewsAdapter = new MovieReviewsAdapter();
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvReviews.setLayoutManager(linearLayoutManager3);
        rvReviews.setAdapter(movieReviewsAdapter);
    }
}

