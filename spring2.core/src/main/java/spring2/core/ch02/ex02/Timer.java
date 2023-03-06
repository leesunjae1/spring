package spring2.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Around
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		
	}
}
