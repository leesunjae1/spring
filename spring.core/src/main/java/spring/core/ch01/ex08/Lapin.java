package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //prototype으로하면 새로운 lapin을 생성한다
public class Lapin {

}
