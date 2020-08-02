package com.ks.backend.Services;

import java.util.List;

import com.ks.backend.Models.User;

public interface UserService {
	
	List<User> findAll();
	
	User findByUid(int uid);
	
	User findByEmail(String email);
	
	void saveOrUpdateUser(User user);
	
	void deleteUser(int uid);
	
}
