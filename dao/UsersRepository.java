package com.dao;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer> {
	
	public User findByEmailId(String emailId);
	
}
