package com.test.converter;

public class State {
	private int id;
	private String name;
	private String country;
	
	public State(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	public State() {
		super();
		
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
