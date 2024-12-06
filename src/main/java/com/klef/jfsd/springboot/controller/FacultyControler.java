package com.klef.jfsd.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("faculty")
public class FacultyControler {
	@GetMapping("/")
	
	public String facultyhome() {
		return "I am Faculty";
	}

}
