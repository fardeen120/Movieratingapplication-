package com.movieratingapplication.movieratingapplication.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movies {
	
	@Id
	private long id;
	private String MovieTitle;
	private double ratings;
//	language-hindi,english,marathi etc
	private String language1;
	private String language2;
	private String genre;
	private String Description;
	private long year;
//	type-hollywood,bollywood,tollywood etc
	private String type;
	private String actor;
	private String actress;
	private String directedby;
	private long earned;
	
	public Movies(long id, String movieTitle, double ratings, String language1, String language2, String genre,
			String description, long year, String type, String actor, String actress, String directedby, long earned) {
		super();
		this.id = id;
		MovieTitle = movieTitle;
		this.ratings = ratings;
		this.language1 = language1;
		this.language2 = language2;
		this.genre = genre;
		Description = description;
		this.year = year;
		this.type = type;
		this.actor = actor;
		this.actress = actress;
		this.directedby = directedby;
		this.earned = earned;
	}

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMovieTitle() {
		return MovieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		MovieTitle = movieTitle;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public String getLanguage1() {
		return language1;
	}

	public void setLanguage1(String language1) {
		this.language1 = language1;
	}

	public String getLanguage2() {
		return language2;
	}

	public void setLanguage2(String language2) {
		this.language2 = language2;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public String getDirectedby() {
		return directedby;
	}

	public void setDirectedby(String directedby) {
		this.directedby = directedby;
	}

	public long getEarned() {
		return earned;
	}

	public void setEarned(long earned) {
		this.earned = earned;
	}
	
	
}