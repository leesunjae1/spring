package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@GetMapping("11")
	public ModelAndView handler11(ModelAndView mv) {
		mv.addObject("user", new User("최한석", 11)); // 컨트럴러가 사용하는 모델은 서비스로부터 받는다
		mv.setViewName("ch02/ex01/user");
		
		return mv;
	} //뷰 하나로 여러가지 모델을 출력한다
	
	@GetMapping("21")
	public String handler21(Model model) {
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user";
	}
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	
	@GetMapping("ch02/ex01/31")
	public void handler31(User user) {
		user.setUsername("양승일");
		user.setAge(31);
	}
	
	@GetMapping("ch02/ex01/32")
	public void handler32(@ModelAttribute("man") User user) {
		user.setUsername("서준한");
		user.setAge(32);
	}
	
	@GetMapping("ch02/ex01/41")
	public User handler41(User user) {
		user.setUsername("김가람");
		user.setAge(21);
		
		return user;
	}
}
