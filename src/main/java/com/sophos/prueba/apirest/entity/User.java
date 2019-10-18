package com.sophos.prueba.apirest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="idUser")
	private Integer idUser;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	public User() {
		// Constructor null
	}
	
	// Getters y setters para el acceso a las propiedades 
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();		
		cadena.append("User [idUser=" + idUser + ", ");
		cadena.append("name=" + userName + ", ");
		cadena.append("lastName=" + lastName + ", ");
		cadena.append("userName=" + userName + ", ");
		cadena.append("password=" + password + ", ");
		cadena.append("email=" + email + "]");
		
		return cadena.toString();
	}
}