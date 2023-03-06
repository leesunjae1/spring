package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer { //aspect을 만드는 것이다
	 //calc, sleep이 주이고 clock은 종이다 종을 어드바이스라고 부른다
	@Around
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		
	}
}
