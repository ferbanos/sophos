package com.sophos.prueba.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sophos.prueba.apirest.entity.User;
import com.sophos.prueba.apirest.service.UserService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class UserRestController {
	// Inyección de dependencias
	@Autowired
	private UserService userService;
	
	// Listado de usuarios existentes
	@GetMapping("/usuarios")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/usuarios/{iduser}")
	public User getUser(@PathVariable int iduser) {
		User user = userService.getUser(iduser);
		return user;
	}

	// POST /users - INSERT un nuevo usuario 
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public User addUser(@RequestBody User user) {
		user.setIdUser(null);
		userService.saveUser(user);
		return user;
	}
	
	// PUT  - UPDATE un usuario existente
	@PutMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public User updateUser(@RequestBody User user) {		
		userService.saveUser(user);		
		return user;
	}	
	
	// DELETE /users/{idUser} - DELETE un usuario existente 
	@DeleteMapping("/usuarios/{iduser}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable int iduser) {		
		userService.deleteUser(iduser);
	}
}