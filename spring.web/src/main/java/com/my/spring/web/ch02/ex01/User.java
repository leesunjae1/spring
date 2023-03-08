package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter, setter가 생성된다
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String username;
	private int age;
}
