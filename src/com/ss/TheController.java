package com.ss;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ss.User;

@Controller
public class TheController {
	
	@RequestMapping("/")
	public String showHome(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Insideasdfadsf /");
		User user = new User("John Doe");
		request.getSession().setAttribute("key_123", user);
		return "home.jsp";
	}
	
}
