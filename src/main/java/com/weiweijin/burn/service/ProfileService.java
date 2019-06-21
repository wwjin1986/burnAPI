package com.weiweijin.burn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weiweijin.burn.model.Profile;
import com.weiweijin.burn.repository.ProfileRepository;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	public List getProfile() {
		List<Profile> list = new ArrayList<>();		
		profileRepository.findAll().forEach(list::add);
		return list;
	}
	
	public void addProfile(Profile profile) {
		profileRepository.save(profile);
	}
	
}
