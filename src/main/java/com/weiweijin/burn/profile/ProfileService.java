package com.weiweijin.burn.profile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	public List getProfiles() {
		List<Profile> list = new ArrayList<>();		
		profileRepository.findAll().forEach(list::add);
		return list;
	}
	
	public void addProfile(Profile profile) {
		profileRepository.save(profile);
	}
	
	public void deleteProfile(Profile profile) {
		profileRepository.delete(profile);
	}
	
}
