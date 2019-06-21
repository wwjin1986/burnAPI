package com.weiweijin.burn.weight;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeightService {

	@Autowired
	private WeightRepository weightRepository;
	
	public List getAllWeights() {
		List<Weight> list = new ArrayList<>();
		weightRepository.findAll()
		.forEach(list::add);
		return list;
	}
	
	public void addNewWeight(Weight weight) {
		weightRepository.save(weight);
	}
}
