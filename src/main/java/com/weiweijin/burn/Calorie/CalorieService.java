package com.weiweijin.burn.Calorie;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	public List getCalorieBurnedByDate(String date) {
		List list = new ArrayList<>();
		Iterator<Calorie> calorieIterator = calorieRepository.findAll().iterator();
		while(calorieIterator.hasNext()) {
			Calorie c = calorieIterator.next();
			if(c.getDate().equals(date)) {
				list.add(c);
			}
		}
		return list;
	}
	
	public int getTotalCalorieBurnedByDate(String date) {
		int calorie = 0;
		Iterator<Calorie> calorieIterator = calorieRepository.findAll().iterator();
		while(calorieIterator.hasNext()) {
			Calorie c = calorieIterator.next();
			if(c.getDate().equals(date)) {
				calorie = calorie + c.getCalorieBurned();
			}
		}
		return calorie;
	}
	public void addCalorieBurned(Calorie calorie) {
		calorieRepository.save(calorie);
		System.out.println(calorie.getCalorieBurned());
	}
}
