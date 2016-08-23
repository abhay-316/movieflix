package io.egen2.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen2.springrest.entity.User;
import io.egen2.springrest.exception.UserAlreadyExistsException;
import io.egen2.springrest.exception.UserNotFoundException;
import io.egen2.springrest.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserRepository repository;

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findOne(String id) {
		User existing = repository.findOne(id);
		if (existing == null) {
			throw new UserNotFoundException("User with id:" + id + " not found");
		}
		return existing;
	}
	@Override
	@Transactional
	public User create(User ur) {
		User existing = repository.findByEmail(ur.getEmail());
		if (existing != null) {
			throw new UserAlreadyExistsException("Email is already in use: " + ur.getEmail());
		}
		return repository.create(ur);
	}

	@Override
	@Transactional
	public User update(String id, User ur) {
		User existing = repository.findOne(id);
		if (existing == null) {
			throw new UserNotFoundException("User with id:" + id + " not found");
		}
		return repository.update(ur);
	}
	@Override
	@Transactional
	public void delete(String id) {
		User existing = repository.findOne(id);
		if (existing == null) {
			throw new UserNotFoundException("User with id:" + id + " not found");
		}
		repository.delete(existing);
	}
}

