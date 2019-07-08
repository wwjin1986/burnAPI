package com.weiweijin.burn.Calorie;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Calorie {

	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	private long Id;
	private String workout;
	private int calorieBurned;
	private String time;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getWorkout() {
		return workout;
	}
	public void setWorkout(String workout) {
		this.workout = workout;
	}
	public int getCalorieBurned() {
		return calorieBurned;
	}
	public void setCalorieBurned(int calorieBurned) {
		this.calorieBurned = calorieBurned;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}