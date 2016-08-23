package io.egen2.springrest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen2.springrest.entity.User;

@Repository
public class UserRepositoryImp implements UserRepository{

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<User> findAll() {
		TypedQuery<User> query = em.createNamedQuery("User.findAll", User.class);
		return query.getResultList();
	}

	@Override
	public User findOne(String id) {
		return em.find(User.class, id);
	}

	@Override
	public User findByEmail(String email) {
		TypedQuery<User> query = em.createNamedQuery("User.findByEmail", User.class);
		query.setParameter("pEmail", email);
		List<User> users = query.getResultList();
		if (users != null && users.size() == 1) {
			return users.get(0);
		}
		return null;
	}

	@Override
	public User create(User ur) {
		em.persist(ur);
		return ur;
	}

	@Override
	public User update(User ur) {
		return em.merge(ur);
	}

	@Override
	public void delete(User ur) {
		em.remove(ur);
	}
}
