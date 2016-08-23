package io.egen2.springrest.service;

import java.util.List;

import io.egen2.springrest.entity.Movie;
//import io.egen2.springrest.entity.User;

public interface MovieService {

	public List<Movie> findAll();

	public Movie findOne(String id);

	public Movie create(Movie ur);
	
	public Movie update(String id, Movie mv);

	public void delete(String id);
}
