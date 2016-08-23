package io.egen2.springrest.repository;

import java.util.List;

import io.egen2.springrest.entity.Movie;
//import io.egen2.springrest.entity.User;

public interface MovieRepository {

	public List<Movie> findAll();

	public Movie findOne(String Title);

	public Movie findByTitle(String Title);

	public Movie create(Movie mv);

	public Movie update(Movie mv);

	public void delete(Movie mv);
}