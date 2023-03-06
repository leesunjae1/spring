package spring2.core.ch01.ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring2.core.ch01.ex01.Rifle;

@Configuration
public class Config2 {
	@Bean
	public Rifle rufle() {
		return new Rifle();
	}
}
