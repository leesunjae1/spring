package spring2.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Before("executin(* spring..*(int))")
	public void clockStart(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("시작시각: " + LocalDateTime.now());
	}
	
	@After("within(spring..Calculator)")
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시각: " + LocalDateTime.now());
	}
	
	@AfterReturning(pointcut="bean(calc*)", returning="result")
	public void printResult(JoinPoint jp, int result) {
		System.out.println(jp.toShortString() + ":" + result);
	}
}
