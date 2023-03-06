package spring.core.ch02.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calculator = ctx.getBean(Calculator.class);
		
		calculator.calc(1);
	}
}

/*
execution(Calculator.calc(..))    비포어드바이스
시작시각: 2023-03-06T17:16:03.487875200

Calculator.calc()                 조인포인트

execution(Calculator.calc(..)):1   애프터리터닝
execution(Calculator.calc(..))

execution(Calculator.calc(..))    애프터어드바이스
종료 시각: 2023-03-06T17:16:03.784304300
*/