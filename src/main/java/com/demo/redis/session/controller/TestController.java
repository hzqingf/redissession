package com.demo.redis.session.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


	@RequestMapping("/")
	public String test(HttpServletRequest request){
		HttpSession session = request.getSession();
		return session.getId();
	}
	
	
	@RequestMapping("/test1")
	public String test1(HttpServletRequest request){
		HttpSession session = request.getSession();
		return session.getId();
	}
	

}
