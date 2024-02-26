package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String city;
	private String useranme;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getUseranme() {
		return useranme;
	}
	public void setUseranme(String useranme) {
		this.useranme = useranme;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Student(int id, String name, String city, String useranme, String password) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.useranme = useranme;
		this.password = password;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", useranme=" + useranme + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
}

