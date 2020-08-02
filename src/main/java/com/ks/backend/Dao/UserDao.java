package com.ks.backend.Dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ks.backend.Models.User;

public interface UserDao extends MongoRepository<User, Integer> {
	
	User findByUid(int uid);
	
	User findByEmail(String email);
	
	List<User> findAll();
}
