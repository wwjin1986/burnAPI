package com.weiweijin.burn.weight;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Weight {

	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private int weight;
	
	private LocalDateTime time;
	
	public Weight() {
		
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

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
}
