package com.ks.backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ks.backend.Models.User;
import com.ks.backend.Services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.findAll();
	}
	
	@RequestMapping(value = "/{uid}", method = RequestMethod.GET)
	public User getUserByUID(@PathVariable int uid) {
		return userService.findByUid(uid);
	}
	
	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	public User getUserByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<?> saveOrUpdateUser(@RequestBody User user) {
		userService.saveOrUpdateUser(user);
		return new ResponseEntity("User added successfully.....",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{uid}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable int uid) {
		userService.deleteUser(userService.findByUid(uid).getUid());
	}

}
