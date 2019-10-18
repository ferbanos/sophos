package com.sophos.prueba.apirest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carsuser")
public class Car {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="plateNumber")
	private String plateNumber;
	
	@Column(name="idUser")
	private Integer idUser;
	
	@Column(name="model")
	private Integer model;
	
	@Column(name="brand")
	private String brand;
			
	@Column(name="color")
	private String color;
	
	public Car() {
		// Constructor null
	}
	
	// Getters y setters para el acceso a las propiedades 
	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();		
		cadena.append("CarsUsers [plateNumber=" + plateNumber + ", ");
		cadena.append("idUser=" + idUser + ", ");
		cadena.append("model=" + model + ", ");
		cadena.append("brand=" + brand + ", ");
		cadena.append("color=" + color + "]");
		
		return cadena.toString();
	}
}