package com.movieratingapplication.movieratingapplication.Services;

import java.util.List;
import java.util.Optional;

import com.movieratingapplication.movieratingapplication.entities.Movies;

public interface MoviesService {
	
	public List<Movies> getMovies();
	
	public Optional<Movies> getMovie(long movieId );
	
	public Movies addMovie(Movies movies);
	
	public Movies updateMovie(Movies movies);
	
	public void deleteMovie(long parseLong);

}
