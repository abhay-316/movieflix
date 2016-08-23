package io.egen2.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen2.springrest.entity.Movie;
//import io.egen2.springrest.entity.User;
//import io.egen2.springrest.entity.User;
import io.egen2.springrest.exception.TitleAlreadyExistsException;
import io.egen2.springrest.exception.TitleNotFoundException;
//import io.egen2.springrest.exception.UserAlreadyExistsException;
//import io.egen2.springrest.exception.UserNotFoundException;
import io.egen2.springrest.repository.MovieRepository;

@Service
public class MovieServiceImp implements MovieService{
	
	@Autowired
	MovieRepository repository;
	
	@Override
	public List<Movie> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Movie findOne(String Title) {
		Movie existing = repository.findOne(Title);
		if (existing == null) {
			throw new TitleNotFoundException("Movie with Title:" + Title + " not found");
		}
		return existing;
	}
	
	@Override
	@Transactional
	public Movie create(Movie mv) {
		Movie existing = repository.findByTitle(mv.getTitle());
		if (existing != null) {
			throw new TitleAlreadyExistsException("Title is already in use: " + mv.getTitle());
		}
		return repository.create(mv);
	}
	
	@Override
	@Transactional
	public Movie update(String Title, Movie mv) {
		Movie existing = repository.findOne(Title);
		if (existing == null) {
			throw new TitleNotFoundException("User with Title:" + Title + " not found");
		}
		return repository.update(mv);
	}
	
	@Override
	@Transactional
	public void delete(String Title) {
		Movie existing = repository.findOne(Title);
		if (existing == null) {
			throw new TitleNotFoundException("User with Title:" + Title + " not found");
		}
		repository.delete(existing);
	}
	
	

}
