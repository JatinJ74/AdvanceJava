package com.gvacharya.querymethods.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookT {

	@Id
	private int id;
	private String name;
	public BookT() {

	}
	public BookT(int id, String name) {

		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
	
}
