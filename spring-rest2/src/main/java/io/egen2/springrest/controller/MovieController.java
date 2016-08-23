package io.egen2.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen2.springrest.entity.Movie;
//import io.egen2.springrest.entity.User;
import io.egen2.springrest.service.MovieService;

@RestController
@RequestMapping(value="/movie")

public class MovieController {

	@Autowired
	MovieService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findAll() {
		return service.findAll();	
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{Title}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie findOne(@PathVariable("Title") String movieId) {
		return service.findOne(movieId);
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie create(@RequestBody Movie mv) {
		return service.create(mv);
	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "{Title}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie update(@PathVariable("Title") String movieId, @RequestBody Movie mv) {
		return service.update(movieId, mv);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "{Title}")
	public void delete(@PathVariable("Title") String movieId) {
		service.delete(movieId);
	}
	
	

}
