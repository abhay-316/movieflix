package io.egen2.springrest.service;

import java.util.List;

import io.egen2.springrest.entity.User;

public interface UserService {

	public List<User> findAll();

	public User findOne(String id);

	public User create(User ur);

	public User update(String id, User ur);

	public void delete(String id);
}

