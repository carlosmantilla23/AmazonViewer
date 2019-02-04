package com.carlosmantilla.amazonviewer.dao;

import java.util.ArrayList;

import com.carlosmantilla.amazonviewer.model.Movie;

public interface MovieDAO {
	
	default Movie setMovieViewed(Movie movie) {
		return movie;
	}

	default ArrayList <Movie> read() {
	ArrayList<Movie> movies = new ArrayList();
	return movies;
	}
	
	default boolean getMovieViewed() {
		return false;
	}
	
}
