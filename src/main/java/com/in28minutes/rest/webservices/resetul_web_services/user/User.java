package com.in28minutes.rest.webservices.resetul_web_services.user;
import com.fasterxml.jackson.annotation.JsonIgnore;
import     com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


@Entity(name = "user_details")
public class User {
	
	@JsonIgnore
	private String password;
	@JsonIgnore
	@Id
	@GeneratedValue
	private Integer Id;
	@Size(min=2, message = "Name should have at least 2 characters")
	@JsonProperty("user_name")
	private String name;
	@Past(message = "birthday should not be in the past")
	private LocalDate birthDate;
	public User(Integer id, String name, LocalDate birthDate) {
		super();
		Id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.password = "Any value";
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	

}
