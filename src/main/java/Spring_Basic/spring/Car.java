package Spring_Basic.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle {
	public void drive () {
		System.out.println("This is car class and method of car");
	}
}
