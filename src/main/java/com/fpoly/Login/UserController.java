package com.fpoly.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class UserController {
	
	
	@Autowired
	HttpServletResponse rs;
	@Autowired
	HttpServletRequest rq;
	
	
	@RequestMapping("/user")
	public String Login() {
		return "Login";
	}
	
	@PostMapping("/hello")
	public String helloUser() {
		String name = rq.getParameter("username");
		String pass = rq.getParameter("password");
		User user = new User(name, pass);
		rq.setAttribute("USER", user);
		if(name.equals("cotm")) {
			return "HelloUser";
		}
		return "Login";
	}
}
