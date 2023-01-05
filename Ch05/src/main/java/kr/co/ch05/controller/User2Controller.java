package kr.co.ch05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch05.service.User2Service;

@Controller
public class User2Controller {
	
	@Autowired
	private User2Service service;
	
	@GetMapping("/user2/list")
	public String list() {
		
	}
	
	@GetMapping()
	public String register() {
		
	}

	public String register() {
		
	}
	
	public String modify() {
		
	}
	
	public String modify() {
		
	}
	
	
}
