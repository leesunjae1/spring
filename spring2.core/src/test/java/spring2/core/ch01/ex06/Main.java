package spring2.core.ch01.ex06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring2.core.ch01.ex05.AppConfig;
import spring2.core.ch01.ex05.Shooter;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Shooter shooter = ctx.getBean("shooter", Shooter.class);
		shooter.fire();
	}
}
