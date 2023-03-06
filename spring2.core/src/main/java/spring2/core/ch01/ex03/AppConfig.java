package spring2.core.ch01.ex03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring2.core.ch01.ex01.Pistol;
import spring2.core.ch01.ex01.Rifle;
import spring2.core.ch01.ex02.Shooter;

@Configuration
public class AppConfig {
	@Bean
	public Pistol pistol() {
		return new Pistol();
	}
	
	@Bean
	public Rifle rifle() {
		return new Rifle();
	}
	
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol());
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setShooterName("한아름");
		shooter.setGun(rifle());
		
		return shooter;
	}
}
