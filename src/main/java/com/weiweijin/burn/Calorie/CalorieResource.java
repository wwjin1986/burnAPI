package com.weiweijin.burn.Calorie;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CalorieResource {

	@Autowired
	private CalorieService calorieService;
	
	@RequestMapping(method = RequestMethod.GET, value="/calories")
	public List getAllCalorie() {
		List allCalorieBurned = new ArrayList<>();
		allCalorieBurned = calorieService.getAllCalorieBurned();
		return allCalorieBurned;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/calories/{date}")
	public List getCalorieByDate(@PathVariable String date) {
		List allCalorieBurnedByDate = calorieService.getCalorieBurnedByDate(date);
		return allCalorieBurnedByDate;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/calories/{date}/total")
	public int getTotalCalorieByDate(@PathVariable String date) {
		int totalCalorieBurnedByDate = calorieService.getTotalCalorieBurnedByDate(date);
		return totalCalorieBurnedByDate;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/calorie")
	public void addCalorieBurned(@RequestBody Calorie calorie) {
		calorieService.addCalorieBurned(calorie);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/profiles/Weiwei/calories/{id}")
	public void deleteExerciseRecordById(@PathVariable Long id) {
		calorieService.deleteExerciseRecordById(id);
		System.out.println("delete record by id"+id);
	}
	
}
