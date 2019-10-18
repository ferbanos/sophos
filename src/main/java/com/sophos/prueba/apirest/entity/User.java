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
	@Column(name="iduser")
	private Integer iduser;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	public User() {
		// Constructor null
	}
	
	// Getters y setters para el acceso a las propiedades 
	public Integer getIdUser() {
		return iduser;
	}

	public void setIdUser(Integer iduser) {
		this.iduser = iduser;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
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
		cadena.append("User [iduser=" + iduser + ", ");
		cadena.append("name=" + username + ", ");
		cadena.append("lastname=" + lastname + ", ");
		cadena.append("username=" + username + ", ");
		cadena.append("password=" + password + ", ");
		cadena.append("email=" + email + "]");
		
		return cadena.toString();
	}
}