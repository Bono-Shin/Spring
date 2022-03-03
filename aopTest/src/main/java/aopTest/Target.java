package aopTest;

import org.springframework.stereotype.Component;

@Component
public class Target {

	public void method1() {
		System.out.println("aop 적용 대상 메소드");
	}
}
