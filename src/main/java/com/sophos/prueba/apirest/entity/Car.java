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
	@Column(name="platenumber")
	private String platenumber;
	
	@Column(name="iduser")
	private Integer iduser;
	
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
		return platenumber;
	}

	public void setPlateNumber(String platenumber) {
		this.platenumber = platenumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getIdUser() {
		return iduser;
	}

	public void setIdUser(Integer iduser) {
		this.iduser = iduser;
	}
	
	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();		
		cadena.append("CarsUsers [platenumber=" + platenumber + ", ");
		cadena.append("idUser=" + iduser + ", ");
		cadena.append("model=" + model + ", ");
		cadena.append("brand=" + brand + ", ");
		cadena.append("color=" + color + "]");
		
		return cadena.toString();
	}
}