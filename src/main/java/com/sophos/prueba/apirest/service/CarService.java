package com.sophos.prueba.apirest.service;

import java.util.List;

import com.sophos.prueba.apirest.entity.Car;

public interface CarService {	
	// Definición de los métodos de la interface	
	public List<Car> getCars();
	
	public void saveCar(Car car);

	public Car getCar(String plateNumber);

	public void deleteCar(String plateNumber);
}