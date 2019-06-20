package com.weiweijin.burn.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiweijin.burn.model.Profile;
import com.weiweijin.burn.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class profileResource {
	
	@Autowired
	private ProfileService profileService;
	@GetMapping
	public Profile weight() {
		return profileService.getProfile();
	}
}
