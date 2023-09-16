package com.movieratingapplication.movieratingapplication.Services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieratingapplication.movieratingapplication.dao.MoviesDao;
import com.movieratingapplication.movieratingapplication.entities.Movies;

@Service
public class MoviesServiceimpl implements MoviesService {

	
//	List<Movies>list;
	@Autowired
	private MoviesDao moviesdao;

	public MoviesServiceimpl() {
	
//		list = new ArrayList<>();
//		list.add(new Movies(120, "Pathan", 9.8, "Hindi", "English","Thriller","Its a movie about good and bad Raw agent", 2022, "Bollywood","shahrukh","deepika","Kabir khan",500));
//		list.add(new Movies(150, "KGF2", 9.8, "Hindi", "Tamil","Thriller","movie about kolar gold fields ruled by rocky bhai", 2022, "Tollywood","Yash","keerthi","ss",600));
	
	}
	
	
	
	
	@Override
	public List<Movies> getMovies() {
		
		return moviesdao.findAll();
	}




	
	@Override
	public Optional<Movies> getMovie(long movieId) {
//		Movies m=null;
//		for(Movies movies:list) {
//			if(movies.getId()==movieId) {
//				m=movies;
//			}
//		}
		return moviesdao.findById(movieId);
	}




	@Override
	public Movies addMovie(Movies movies) {
//		list.add(movies);
		return moviesdao.save(movies);
	}




	@Override
	public Movies updateMovie(Movies movies) {
//		list.forEach(e -> {
//			if(e.getId() == movies.getId()) {
//				e.setMovieTitle(movies.getMovieTitle());
//				e.setRatings(movies.getRatings());
//				e.setLanguage1(movies.getLanguage1());
//				e.setLanguage2(movies.getLanguage2());
//				e.setGenre(movies.getGenre());
//				e.setDescription(movies.getDescription());
//				e.setYear(movies.getYear());
//				e.setType(movies.getType());
//				e.setActor(movies.getActor());
//				e.setActress(movies.getActress());
//				e.setDirectedby(movies.getDirectedby());
//				e.setEarned(movies.getEarned());
//			}
//		});
		return moviesdao.save(movies);
	}




	@Override
	public void deleteMovie(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		Movies entity = moviesdao.getOne(parseLong);
		moviesdao.delete(entity);
	}













	

}
