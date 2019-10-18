package com.sophos.prueba.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sophos.prueba.apirest.dao.UserDAO;
import com.sophos.prueba.apirest.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<User> getUsers() {		
		return (List<User>) userDAO.findAll();
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		userDAO.save(user);
	}

	@Override
	@Transactional(readOnly=true)
	public User getUser(Integer idUser) {		
		return userDAO.findById(idUser).get();
	}

	@Override
	@Transactional
	public void deleteUser(Integer idUser) {
		userDAO.deleteById(idUser);
	}	
}
