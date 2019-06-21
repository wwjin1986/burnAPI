package com.weiweijin.burn.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weiweijin.burn.model.Profile;
import com.weiweijin.burn.service.ProfileService;

@RestController
public class profileResource {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping
	public List getProfile() {
		return profileService.getProfile();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profile")
	public void addProfile(@RequestBody Profile profile) {
		profileService.addProfile(profile);
		System.out.println("post");
	}
	
	
}
