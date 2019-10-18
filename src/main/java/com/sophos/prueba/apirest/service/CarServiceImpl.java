package com.sophos.prueba.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sophos.prueba.apirest.dao.CarDAO;
import com.sophos.prueba.apirest.entity.Car;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDAO carDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<Car> getCars() {		
		return (List<Car>) carDAO.findAll();
	}

	@Override
	@Transactional
	public void saveCar(Car car) {
		carDAO.save(car);
	}

	@Override
	@Transactional(readOnly=true)
	public Car getCar(String plateNumber) {		
		return carDAO.findById(plateNumber).get();
	}

	@Override
	@Transactional
	public void deleteCar(String plateNumber) {
		carDAO.deleteById(plateNumber);
	}	
}