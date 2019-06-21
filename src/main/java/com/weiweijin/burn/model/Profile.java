package com.weiweijin.burn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {

	@Id
	private String name;
	private int weight;
	private int height;
	private int age;
	
	public Profile() {
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
