package com.weiweijin.burn.model;

public class Profile {

	private String name;
	private int weight;
	private int height;
	private int age;
	
	public Profile(String name, int weight, int height, int age) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
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
