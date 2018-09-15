package com.dev.app.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.app.persistence.bean.User;
import com.dev.app.persistence.dao.UserDao;

@Service
public class ClientService {

	@Autowired
	private UserDao userDao;
	
	public User getUser(int id) {
		return userDao.findUserById(id);
	}
	
	public List<User> getAllUsers() {
		return userDao.findAllUsers();
	}
	
}
