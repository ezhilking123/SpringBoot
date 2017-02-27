package com.ezhil.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class HelloController {
	
	@RequestMapping("hello")
	public String helloCalled(){
		
		return "You called hello request mapping";
	}

}
