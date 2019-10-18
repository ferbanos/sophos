package com.sophos.prueba.apirest.dao;

import org.springframework.data.repository.CrudRepository;
import com.sophos.prueba.apirest.entity.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}