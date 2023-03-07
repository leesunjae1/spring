package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex02") //중복방지
@RequestMapping("ch02/ex02") //공통 url를 써주면 중복을 방지한다
public class UserController {
	@GetMapping("userIn")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	/*
	@PostMapping("userOut") //리퀘스트파라미터를 추가할때 post
	public String userOut(@RequestParam String username,
						@RequestParam int age,
						@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
						Model model) {
		model.addAttribute("user", new User(username, age, regDate));
		return "ch02/ex02/userOut";
	}
	*/
	@PostMapping("userOut") //requestparam 생략이 가능하다
	public String userOut( String username,
						int age,
						@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
						Model model) {
		model.addAttribute("user", new User(username, age, regDate));
		return "ch02/ex02/userOut";
	}
}
