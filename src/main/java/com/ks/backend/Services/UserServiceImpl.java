package com.ks.backend.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ks.backend.Dao.UserDao;
import com.ks.backend.Models.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findByUid(int uid) {
		return userDao.findByUid(uid);
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public void saveOrUpdateUser(User user) {
		userDao.save(user);
	}

	@Override
	public void deleteUser(int uid) {
		userDao.deleteById(uid);
	}

}
