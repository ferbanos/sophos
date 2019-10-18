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

import com.sophos.prueba.apirest.entity.Car;
import com.sophos.prueba.apirest.service.CarService;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class CarsRestController {
	// Inyección de dependencias
	@Autowired
	private CarService carService;
	
	// Listado de carros existentes
	@GetMapping("/carros")
	public List<Car> getCars() {
		return carService.getCars();
	}

	@GetMapping("/carros/{platenumber}")
	public Car getCar(@PathVariable String platenumber) {
		Car car = carService.getCar(platenumber);
		return car;
	}

	// POST /users - INSERT un nuevo carro 
	@PostMapping("/carros")
	@ResponseStatus(HttpStatus.CREATED)
	public Car addCar(@RequestBody Car car) {
		car.setPlateNumber(null);
		carService.saveCar(car);
		return car;
	}
	
	// PUT  - UPDATE un carro existente
	@PutMapping("/carros")
	@ResponseStatus(HttpStatus.CREATED)
	public Car updateCar(@RequestBody Car car) {		
		carService.saveCar(car);		
		return car;
	}	
	
	// DELETE /carsUser/{platenumber} - DELETE un carro existente 
	@DeleteMapping("/carsuser/{platenumber}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCar(@PathVariable String platenumber) {		
		carService.deleteCar(platenumber);
	}
}