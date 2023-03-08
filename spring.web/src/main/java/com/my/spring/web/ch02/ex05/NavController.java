package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
		return "forward:target"; //앞에 forward를 붙히면  target은 url이 된다
	}
	
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target"; //target은 뷰네임이다
	}
	
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target";
	}
	
	@GetMapping("naver") //다른 서버에 있으면 redirect를 사용해야한다
	public String naver() {
		return "redirect:https://www.naver.com";
	}
}
