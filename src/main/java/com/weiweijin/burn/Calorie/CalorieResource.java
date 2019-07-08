package com.weiweijin.burn.Calorie;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	@RequestMapping(method = RequestMethod.POST, value="/calorie")
	public void addCalorieBurned(@RequestBody Calorie calorie) {
		calorieService.addCalorieBurned(calorie);
	}
}