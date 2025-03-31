package com.rbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbu.dao.UserDao;
import com.rbu.rest.User;

@Service
public class RegService {
	
	@Autowired
	UserDao userDao;
	
	public void createUser(User user) {
		userDao.save(user);
	}
	

}
