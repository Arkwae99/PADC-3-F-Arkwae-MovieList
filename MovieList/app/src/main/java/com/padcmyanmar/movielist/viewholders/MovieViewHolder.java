package com.padcmyanmar.movielist.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.data.vo.PopularMoviesVO;
import com.padcmyanmar.movielist.delegates.MoviesActionDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ag Phone Khant on 8/12/2017.
 */


public class MovieViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.iv_forest_gump)
    ImageView ivMoviePoster;

    @BindView(R.id.tv_movie_name)
    TextView tvMovieName;

    @BindView(R.id.tv_movie_rating)
    TextView tvMovieRating;

    private MoviesActionDelegate mMoviesActionDelegate;

    public MovieViewHolder(View itemView, MoviesActionDelegate moviesActionDelegate) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mMoviesActionDelegate = moviesActionDelegate;

    }

    @OnClick(R.id.cv_movie)
    public void onMoviesTap(View view) {
        mMoviesActionDelegate.onTapMovies();
    }

    public void setMovies(PopularMoviesVO movies) {
        tvMovieName.setText(movies.getTitle());
//        tvCategory.setText((CharSequence) movies.getGenreIds());
        tvMovieRating.setText(String.valueOf(movies.getVoteAverage()));

        String imagePath = "http://image.tmdb.org/t/p/original/"+ movies.getPosterPath();
        Glide.with(ivMoviePoster.getContext())
                .load(imagePath)
                .into(ivMoviePoster);
    }
}
