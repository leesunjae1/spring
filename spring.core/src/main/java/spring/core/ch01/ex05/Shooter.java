package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol; //Nullable - DI할게 없어도 괜찮다
	@Autowired @Nullable private Gun rifle;
	//싱글로 작업할땐 변수명을 임의로 작성해도된다
	
	public void fire() {
		try {
			pistol.fire();
			rifle.fire();
		} catch(NullPointerException e) {}	
	}
}
