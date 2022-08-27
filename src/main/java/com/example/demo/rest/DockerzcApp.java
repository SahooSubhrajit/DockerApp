package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerzcApp {

	@GetMapping(value = "/welcome/{name}")
	public String getName(@PathVariable("name") String name) {
		
		if(name.equals("kaibalya")) {
			String fname1 = name+" WelCome to Citiustech1";
			return fname1;
		}
		
		String fname = name+" WelCome to Citiustech";
		return fname;
	}
}
