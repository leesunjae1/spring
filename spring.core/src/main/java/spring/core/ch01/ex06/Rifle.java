package spring.core.ch01.ex06;

@NoComponent // ioc를 안할 때 사용한다 
public class Rifle {
	public void fire() {
		System.out.println("소총 탕탕");
	}
}
