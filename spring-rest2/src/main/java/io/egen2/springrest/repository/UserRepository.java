package io.egen2.springrest.repository;

import java.util.List;

import io.egen2.springrest.entity.User;

public interface UserRepository {

	public List<User> findAll();

	public User findOne(String id);

	public User findByEmail(String email);

	public User create(User ur);

	public User update(User ur);

	public void delete(User ur);
}
