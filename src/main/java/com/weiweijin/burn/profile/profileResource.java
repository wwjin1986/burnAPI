package com.weiweijin.burn.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class profileResource {
	
	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/profiles")
	public List getProfiles() {
		return profileService.getProfiles();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profiles")
	public void addProfile(@RequestBody Profile profile) {
		profileService.addProfile(profile);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/profiles")
	public void deleteProfile(@RequestBody Profile profile) {
		profileService.deleteProfile(profile);
	}
	
}
