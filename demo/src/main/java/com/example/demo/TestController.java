package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Priyanshu Kumar
 */

@RestController
public class TestController {
	
	@GetMapping("/")
	public String getMethod(){
		return "Hello world";
	}
}
