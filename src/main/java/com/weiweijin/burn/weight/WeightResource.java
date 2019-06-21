package com.weiweijin.burn.weight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class WeightResource {
	
	@Autowired
	private WeightService weightService;
	
	@RequestMapping("/profiles/weiwei")
	public List<Weight> getWeights() {
		return weightService.getAllWeights();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profiles/weiwei")
	public void addNewWeight(@RequestBody Weight weight) {
		weightService.addNewWeight(weight);
		
	}
}
