package com.fpoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {
	@Autowired
	HttpServletResponse response;
	
	@Autowired
	HttpServletRequest request;
	
	@GetMapping("/hello")
	public String hello() {
		String fullname = request.getParameter("hoten");
		if(!fullname.isEmpty()) {
			request.setAttribute("message", fullname);
		}
		return "welcome";
	}
}
