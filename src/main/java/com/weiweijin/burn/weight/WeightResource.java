package com.weiweijin.burn.weight;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class WeightResource {
	
	@Autowired
	private WeightService weightService;
	
	@RequestMapping(method=RequestMethod.OPTIONS, value = "/profiles/Weiwei/{id}")
	public void options() {
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/profiles/weiwei/weights")
	public List<Weight> getWeights() {
		System.out.println("get all records");
		return weightService.getAllWeights();
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/profiles/Weiwei")
	public void addNewWeight(@RequestBody Weight weight) {
		weightService.addNewWeight(weight);		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/profiles/Weiwei/{id}")
	public void deleteWeightRecord(@PathVariable("id") Long id) {
	weightService.deleteWeightRecord(id);
	}
}
