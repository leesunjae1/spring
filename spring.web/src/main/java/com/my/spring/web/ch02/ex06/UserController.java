package com.my.spring.web.ch02.ex06;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller("ch02.ex06")
@RequestMapping("ch02/ex06")
public class UserController {
	@GetMapping("login")   //required = 있으면 있는대로, 없으면 없는대로
	public String loginIn(@CookieValue(required=false) String username, @ModelAttribute("user") UserDto user) {
		user.setUsername(username);
		return "ch02/ex06/login";
	}
	
	@PostMapping("login")
	public String login(@ModelAttribute("user") UserDto user, String rememberMe,
			HttpSession session, HttpServletResponse response) {
		session.setAttribute("username", user.getUsername());
		
		if(rememberMe != null && rememberMe.equals("on")) {     //쿠키저장방법
			Cookie cookie = new Cookie("username", user.getUsername());
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}
		
		return "ch02/ex06/logout";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login"; //작업이 끝났으니 redirect를 사용한다
	}
}
