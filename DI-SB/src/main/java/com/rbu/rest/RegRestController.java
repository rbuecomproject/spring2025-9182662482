package com.rbu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbu.service.RegService;

@RestController
public class RegRestController {
	@Autowired
	RegService regService;
	
	@PostMapping("/reg")
	public String register(@RequestBody User user) {
		regService.createUser(user);
		return "success";
	}

}
