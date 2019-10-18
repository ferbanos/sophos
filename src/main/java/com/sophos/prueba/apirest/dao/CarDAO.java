package com.sophos.prueba.apirest.dao;

import org.springframework.data.repository.CrudRepository;
import com.sophos.prueba.apirest.entity.Car;

public interface CarDAO extends CrudRepository<Car, String> {

}