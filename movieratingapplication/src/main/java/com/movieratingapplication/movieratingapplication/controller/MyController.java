package com.movieratingapplication.movieratingapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieratingapplication.movieratingapplication.Services.MoviesService;
import com.movieratingapplication.movieratingapplication.entities.Movies;

@RestController
@RequestMapping("/movie")
public class MyController {
	
	@Autowired
	private MoviesService moviesservice;
	
	
	
	@GetMapping("/home")
	public String home() {
		return "this is movie app";
	}
	
	@GetMapping("/movies")
	public List<Movies> getMovies(){
		return this.moviesservice.getMovies();
		
	}
//	return particular movieid
	@GetMapping("/movies/{movieId}")
	public Optional<Movies> getmovie(@PathVariable String movieId) {
		return this.moviesservice.getMovie(Long.parseLong(movieId));
		
		
	}
	
	@PostMapping("/movies")
	public Movies addmovie(@RequestBody Movies movies) {
		return this.moviesservice.addMovie(movies);
		
	}
	
	@PutMapping("/movies")
	public Movies updateMovie(@RequestBody Movies movies) {
		return this.moviesservice.updateMovie(movies);
		
	}
	@DeleteMapping("/movies/{movieId}")
	public ResponseEntity<HttpStatus> deletemovie(@PathVariable String movieId){
		try {
			this.moviesservice.deleteMovie(Long.parseLong(movieId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
