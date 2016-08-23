package io.egen2.springrest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen2.springrest.entity.Movie;
//import io.egen2.springrest.entity.User;

@Repository

public class MovieRepositoryImp implements MovieRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Movie> findAll() {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findAll", Movie.class);
		return query.getResultList();
	}
	
	@Override
	public Movie findOne(String Title) {
		return em.find(Movie.class, Title);

    }
	
	@Override
	public Movie findByTitle(String Title) {
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findByTitle", Movie.class);
		query.setParameter("pTitle", Title);
		List<Movie> movies = query.getResultList();
		if (movies != null && movies.size() == 1) {
			return movies.get(0);
		}
		return null;
	}
	
	@Override
	public Movie create(Movie mv) {
		em.persist(mv);
		return mv;

	}
	
	@Override
	public Movie update(Movie mv) {
		return em.merge(mv);
	}
	
	@Override
	public void delete(Movie mv) {
		em.remove(mv);
	}
	
	
	
}