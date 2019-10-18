package com.sophos.prueba.apirest.service;

import java.util.List;
import com.sophos.prueba.apirest.entity.User;

public interface UserService {	
	// Definición de los métodos de la interface	
	public List<User> getUsers();
	
	public void saveUser(User user);

	public User getUser(Integer idUser);

	public void deleteUser(Integer idUser);
}