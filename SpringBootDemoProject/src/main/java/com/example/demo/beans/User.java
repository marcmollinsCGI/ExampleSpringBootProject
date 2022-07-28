package com.example.demo.beans;

public class User {

	int id;

	String name;
	int age;
	int height;
	String sport;
	String author;
		
	public User(int id, String name, int age, int height, String sport, String author) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		this.sport = sport;
		this.author = author;
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
		
	
}
