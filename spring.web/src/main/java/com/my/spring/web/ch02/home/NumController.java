package com.my.spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.home")
@RequestMapping("ch02/home")
public class NumController {
	
}
/*
폼에 자연수 하나를 입력한다. matches
폼을 제출한다.
입력값 <=  x < 입력값 + 1인, x를 출력한다.
x는 실수이다.
x는 랜덤값이다.
x는 소수점 이하 한자리까지 표현한다.
*/