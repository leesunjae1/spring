package spring2.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component
public class Rifle implements Gun{
	@Override
	public void fire() {
		System.out.println("소총 탕탕");
	}
}
