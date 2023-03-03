package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component  //소문자p로 pistol로 bean이 자동 생성된다
public class Pistol implements Gun{
	@Override
	public void fire() {
		System.out.println("권총 탕탕.");
	}

}
