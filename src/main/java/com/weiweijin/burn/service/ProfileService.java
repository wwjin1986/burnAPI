package com.weiweijin.burn.service;

import org.springframework.stereotype.Service;

import com.weiweijin.burn.model.Profile;

@Service
public class ProfileService {

	private Profile person = new Profile("lily", 50, 160, 33);
	
	public Profile getProfile() {
		return person;
	}
	
}
