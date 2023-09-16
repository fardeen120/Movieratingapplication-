package com.movieratingapplication.movieratingapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieratingapplication.movieratingapplication.entities.Movies;

public interface MoviesDao extends JpaRepository<Movies, Long> {

}
