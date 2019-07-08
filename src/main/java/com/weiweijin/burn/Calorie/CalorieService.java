package com.weiweijin.burn.Calorie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalorieService {

	@Autowired
	private CalorieRepository calorieRepository;
	
	public List getAllCalorieBurned() {
		List list = new ArrayList<>();
		calorieRepository.findAll().forEach(list::add);
		return list;
	}
	public void addCalorieBurned(Calorie calorie) {
		calorieRepository.save(calorie);
		System.out.println(calorie.getCalorieBurned());
	}
}
