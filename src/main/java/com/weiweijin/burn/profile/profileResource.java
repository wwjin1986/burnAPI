package com.weiweijin.burn.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000","https://wwjin1986.github.io"})
public class profileResource {
	
	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/profiles")
	public List getProfiles() {
		return profileService.getProfiles();
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/profiles/{name}")
	public Profile getProfileByName(@PathVariable String name) {
		return profileService.getProfileByName(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profiles")
	public void addProfile(@RequestBody Profile profile) {
		profileService.addProfile(profile);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="profiles/Weiwei/{dailyGoal}")
	public void updateDailyGoal(@PathVariable int dailyGoal) {
	profileService.updateProfileDailyGoal("Weiwei", dailyGoal);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/profiles")
	public void deleteProfile(@RequestBody Profile profile) {
		profileService.deleteProfile(profile);
	}
	
}
